package com.edwin.cobos.patterns.visitor.visitor;

import com.edwin.cobos.patterns.visitor.pattern.Node;
import com.edwin.cobos.patterns.visitor.pattern.Root;

public interface NodeVisitor {
    void visit(Root root);
    void visit(Node node);
}
