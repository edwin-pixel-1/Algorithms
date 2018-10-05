package com.edwin.cobos.patterns.proxy.choice1;

import java.util.HashMap;

public class TableProxy implements ITable {

    private final ITable table;
    private static volatile HashMap<Integer, Integer> instances = new HashMap<>();
    private static volatile int MAX_INSTANCES_NUMBER = 3;

    public TableProxy() {
        this.table = new Table();
        instances.put(this.hashCode(), this.hashCode());
    }

    @Override
    public int numOfRows() {
        try {
            checkInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (table) {
            return table.numOfRows();
        }
    }

    @Override
    public IRow getRow(int rowNum) {
        try {
            checkInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (table) {
            return table.getRow(rowNum);
        }
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        try {
            checkInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (table) {
            table.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        try {
            checkInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (table) {
            table.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        try {
            checkInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (table) {
            table.deleteRow(rowNum);
        }
    }

    private void checkInstance() throws Exception {
        if (instances.size() > MAX_INSTANCES_NUMBER) {
            throw new Exception("Limited");
        }
    }
}
