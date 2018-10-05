package com.edwin.cobos.patterns.proxy.choice1;

public class Table implements ITable {
    @Override
    public int numOfRows() {
        return 0;
    }

    @Override
    public IRow getRow(int rowNum) {
        return null;
    }

    @Override
    public void addRow(IRow row, int rowNum) {

    }

    @Override
    public void modifyRow(int rowNum, IRow row) {

    }

    @Override
    public void deleteRow(int rowNum) {

    }
}
