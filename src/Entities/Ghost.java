package Entities;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ghost extends Character implements KeyListener {

    public Ghost(String icon, Color color, int x, int y) {
        super(icon, color, x, y);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
