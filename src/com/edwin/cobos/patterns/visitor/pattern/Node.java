package com.edwin.cobos.patterns.visitor.pattern;

import com.edwin.cobos.patterns.visitor.visitor.NodeVisitor;

public class Node extends Composite {

    public Node(String name) {
        super(name);
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
        super.accept(nodeVisitor);
    }

    @Override
    public void addChild(Component component) {
        super.addChild(component);
        component.setSide(this.side);
    }
}
