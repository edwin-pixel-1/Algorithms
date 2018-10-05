package com.edwin.cobos.patterns.visitor;

import com.edwin.cobos.patterns.visitor.pattern.*;
import com.edwin.cobos.patterns.visitor.visitor.DisplayNodeVisitor;
import com.edwin.cobos.patterns.visitor.visitor.NodeVisitor;

public class Client {

    public static void main(String[] args) {

        Composite mindMap = MindMapData.getMindMapTree();

        NodeVisitor visitor = new DisplayNodeVisitor();

        mindMap.accept(visitor);

        String result = visitor.toString();

        System.out.println(result);
    }
}
