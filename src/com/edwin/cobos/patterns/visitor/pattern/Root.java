package com.edwin.cobos.patterns.visitor.pattern;

import com.edwin.cobos.patterns.visitor.visitor.NodeVisitor;

public class Root extends Composite {

    public Root(String name) {
        super(name);
        setSide(NodeSide.NONE);
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
        super.accept(nodeVisitor);
    }

    public void addChild(Component component, NodeSide nodeSide) {
        addChild(component);
        component.setSide(nodeSide);
    }
}
