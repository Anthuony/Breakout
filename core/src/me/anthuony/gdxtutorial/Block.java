package me.anthuony.gdxtutorial;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Block extends Rectangle {

    boolean destroyed = false;

    public Block(int x, int y, int length, int height) {
        super(x, y, length, height);
    }

    public void draw(ShapeRenderer renderer) {
        if(destroyed) { return; }
        renderer.rect(x - (length / 2f), y - (height / 2f), length, height);
    }
}
