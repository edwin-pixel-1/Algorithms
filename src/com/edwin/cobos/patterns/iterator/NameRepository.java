package com.edwin.cobos.patterns.iterator;

public class NameRepository implements AggregateA {
    private String names[][] = {{"Rob", "Jon"},
            {"Jul", "-"},
            {"Pat", "Ken"}};

    @Override
    public IteratorA getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IteratorA {
        int indexRow;
        int indexCol;

        @Override
        public boolean hasNext() {
            if ((indexRow < names.length) && (indexCol < names[indexRow].length)) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                String el = names[indexRow][indexCol];

                indexCol++;
                if(indexCol >= names[indexRow].length) {
                    indexCol = 0;
                    indexRow++;
                }

                if (el.equals("-")) {
                    return next();
                }
            }
            return null;
        }
    }
}
