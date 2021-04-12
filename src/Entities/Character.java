package Entities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Character {
    private Image img;
    public int x, y;
    public int width, height;

    public Character(String img, int x, int y) {
        try {
            this.img = ImageIO.read(new File("src/images/" + img));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = x;
        this.y = y;
        width = 16;
        height = 16;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void draw(Graphics g, Component c){
        g.drawImage(img, x, y, width, height, c);
    }
}
