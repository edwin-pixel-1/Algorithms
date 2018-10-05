package com.edwin.cobos.patterns.visitor.pattern;

import com.edwin.cobos.patterns.visitor.visitor.NodeVisitor;

public abstract class Component {
    protected String name;
    NodeSide side;

    public Component(String name) {
        this.name = name;
        this.side = NodeSide.NONE;
    }

    public abstract void accept(NodeVisitor nodeVisitor);

    public NodeSide getSide() {
        return side;
    }

    public void setSide(NodeSide side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }
}
