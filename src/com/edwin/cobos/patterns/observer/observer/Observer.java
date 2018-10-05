package com.edwin.cobos.patterns.observer.observer;

import java.util.List;

public interface Observer {

    public void updateNames(List<String> list);

    public void addName(String user);

}
