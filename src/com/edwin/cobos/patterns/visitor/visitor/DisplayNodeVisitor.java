package com.edwin.cobos.patterns.visitor.visitor;

import com.edwin.cobos.patterns.visitor.pattern.Node;
import com.edwin.cobos.patterns.visitor.pattern.NodeSide;
import com.edwin.cobos.patterns.visitor.pattern.Root;

import java.util.HashMap;
import java.util.Map;

public class DisplayNodeVisitor implements NodeVisitor {

    private Root root;
    private Map<String, Integer> rightCounter;
    private Map<String, Integer> leftCounter;

    public DisplayNodeVisitor() {
        rightCounter = new HashMap<>();
        leftCounter = new HashMap<>();
    }

    @Override
    public void visit(Root root) {
        this.root = root;
    }

    @Override
    public void visit(Node node) {
        Map<String, Integer> counter;

        if (node.getSide() == NodeSide.RIGHT) {
            counter = rightCounter;
        } else {
            counter = leftCounter;
        }

        String firstLetter = node.getName().substring(0, 1);
        if (!counter.containsKey(firstLetter)) {
            counter.put(firstLetter, 1);
        } else {
            Integer count = counter.get(firstLetter);
            counter.replace(firstLetter, count + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(root.getName()).append("\n");
        sb.append("Right Nodes: ").append("\n");
        for (String nodeKey : rightCounter.keySet()) {
            sb.append(rightCounter.get(nodeKey)).append(" ").append(nodeKey).append(" nodes").append("\n");
        }
        sb.append("Left Nodes: ").append("\n");
        for (String nodeKey : leftCounter.keySet()) {
            sb.append(leftCounter.get(nodeKey)).append(" ").append(nodeKey).append(" nodes").append("\n");
        }
        return sb.toString();
    }
}
