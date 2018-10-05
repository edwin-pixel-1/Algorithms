package com.edwin.cobos.patterns.visitor;

import com.edwin.cobos.patterns.visitor.pattern.Composite;
import com.edwin.cobos.patterns.visitor.pattern.Node;
import com.edwin.cobos.patterns.visitor.pattern.NodeSide;
import com.edwin.cobos.patterns.visitor.pattern.Root;

public class MindMapData {

    public static Composite getMindMapTree() {
        Root root = new Root("Topic");
        Composite nodeA = new Node("A");
        Composite nodeB = new Node("B");
        Composite nodeC = new Node("C");
        Composite nodeD = new Node("D");
        Composite nodeE = new Node("E");
        Composite nodeF = new Node("F");

        Composite nodeA1 = new Node("A1");
        Composite nodeA2 = new Node("A2");
        Composite nodeB1 = new Node("B1");
        Composite nodeB2 = new Node("B2");
        Composite nodeC1 = new Node("C1");
        Composite nodeC2 = new Node("C2");

        Composite nodeAA1 = new Node("AA1");
        Composite nodeAA2 = new Node("AA2");
        Composite nodeAA3 = new Node("AA3");

        Composite nodeD1 = new Node("D1");
        Composite nodeD2 = new Node("D2");
        Composite nodeE1 = new Node("E1");
        Composite nodeE2 = new Node("E2");
        Composite nodeE3 = new Node("E3");
        Composite nodeF1 = new Node("F1");
        Composite nodeF2 = new Node("F2");

        root.addChild(nodeA, NodeSide.RIGHT);
        root.addChild(nodeB, NodeSide.RIGHT);
        root.addChild(nodeC, NodeSide.RIGHT);
        root.addChild(nodeD, NodeSide.LEFT);
        root.addChild(nodeE, NodeSide.LEFT);
        root.addChild(nodeF, NodeSide.LEFT);

        nodeA.addChild(nodeA1);
        nodeA.addChild(nodeA2);
        nodeA1.addChild(nodeAA1);
        nodeA1.addChild(nodeAA2);
        nodeA1.addChild(nodeAA3);

        nodeB.addChild(nodeB1);
        nodeB.addChild(nodeB2);

        nodeC.addChild(nodeC1);
        nodeC.addChild(nodeC2);

        nodeD.addChild(nodeD1);
        nodeD.addChild(nodeD2);

        nodeE.addChild(nodeE1);
        nodeE.addChild(nodeE2);
        nodeE.addChild(nodeE3);

        nodeF.addChild(nodeF1);
        nodeF.addChild(nodeF2);

        return root;
    }
}
