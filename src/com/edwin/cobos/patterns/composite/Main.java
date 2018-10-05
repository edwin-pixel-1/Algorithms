package com.edwin.cobos.patterns.composite;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String html = DataService.loadHTML();

        Element root = getXMLDocument(html);

        Component rootComponent = createRenderTree(root, 0);
        rootComponent.print();

        System.out.println("End");
    }

    private static Component createRenderTree(Node element, int level) {
        NodeList nodeList = element.getChildNodes();
        Component component = null;
        if (nodeList.getLength() > 0) {
            component = new Composite(element.getNodeName(), element.getNodeValue(), level);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Component child = createRenderTree(nodeList.item(i), level + 1);
                component.addItem(child);
            }
        } else {
            component = new Leaf(element.getNodeName(), element.getNodeValue(), level);
        }

        if (element.getAttributes() != null && element.getAttributes().getLength() > 0) {
            NamedNodeMap attrs = element.getAttributes();
            for (int i = 0; i < attrs.getLength(); i++) {
                Node node = attrs.item(i);
                component.addAttribute(node.getNodeName(), node.getNodeValue());
            }
        }
        return component;
    }

    private static Element getXMLDocument(String html) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<?xml version=\"1.0\"?>");
            sb.append(html);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            ByteArrayInputStream input = new ByteArrayInputStream(sb.toString().getBytes("UTF-8"));
            Document doc = builder.parse(input);
            //doc.getDocumentElement().normalize();
            return doc.getDocumentElement();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
