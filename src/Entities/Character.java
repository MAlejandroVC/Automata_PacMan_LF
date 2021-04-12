package Entities;

public class Character {
    private String icon;
    private Color color;
    private int x, y;

    public Character(String icon, Color color, int x, int y) {
        this.icon = icon;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    public String getIcon() {
        return icon;
    }

    public Color getColor(){
        return color;
    }

    public void print(){
        Color.println(this.icon, this.color);
    }
}
