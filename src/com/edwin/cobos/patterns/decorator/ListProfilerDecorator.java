package com.edwin.cobos.patterns.decorator;

import java.util.AbstractList;

public abstract class ListProfilerDecorator<E> extends AbstractList<E> {

    protected AbstractList<E> list;

    public ListProfilerDecorator(AbstractList<E> list) {
        this.list = list;
    }

}
