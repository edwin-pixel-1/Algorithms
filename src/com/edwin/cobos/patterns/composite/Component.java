package com.edwin.cobos.patterns.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class Component {

    protected Collection<Component> list = new ArrayList<>();

    protected String tag;
    protected String value;
    protected int level;
    protected Map<String, String> attributes = new HashMap<>();

    public Component(String tag, String value, int level) {
        this.tag = tag;
        this.value = value;
        this.level = level;
    }

    public void print() {
        for(int i = 0; i <= level*3; i++) {
            System.out.print("-");
        }
    }

    public void addItem(Component item) {
        list.add(item);
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

}
