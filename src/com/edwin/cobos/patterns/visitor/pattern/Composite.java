package com.edwin.cobos.patterns.visitor.pattern;

import com.edwin.cobos.patterns.visitor.visitor.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        children.forEach(child -> child.accept(nodeVisitor));
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    public void addChild(Component component) {
        children.add(component);
    }
}
