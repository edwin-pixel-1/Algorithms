package com.edwin.cobos.patterns.mediator;

import com.edwin.cobos.patterns.mediator.scenes.PuzzleScene;

class Director extends BaseDirector {

    Director() {
        scene = new PuzzleScene(root, 850, 650);
    }
}
