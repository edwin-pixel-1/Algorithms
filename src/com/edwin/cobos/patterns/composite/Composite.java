package com.edwin.cobos.patterns.composite;

public class Composite extends Component {

    public Composite(String tag, String value, int level) {
        super(tag, value, level);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Composite tag=" + tag);
        if (attributes.size() > 0) {
            System.out.print(" Attrs[");
            for (String key : attributes.keySet()) {
                System.out.print(key + "=" + attributes.get(key) + " ");
            }
            System.out.print("]");
        }
        System.out.print("\n");
        for (Component item : list) {
            item.print();
        }
    }
}
