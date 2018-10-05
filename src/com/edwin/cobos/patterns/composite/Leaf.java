package com.edwin.cobos.patterns.composite;

public class Leaf extends Component {

    public Leaf(String tag, String value, int level) {
        super(tag, value, level);
    }

    @Override
    public void addItem(Component item) {
        try {
            throw new Exception("Not allowed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Leaf [tag=" + tag + ", value=" + value + "]");
        System.out.print("\n");
    }
}
