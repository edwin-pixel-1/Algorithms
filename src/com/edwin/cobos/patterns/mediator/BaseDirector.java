package com.edwin.cobos.patterns.mediator;

import javafx.scene.Group;
import javafx.scene.Scene;

public abstract class BaseDirector {

    protected Scene scene;
    protected Group root;

    public BaseDirector() {
        root = new Group();
    }

    public Scene getScene() {
        return scene;
    }

    public void changeScene(Scene scene) {
        this.scene = scene;
    }
}
