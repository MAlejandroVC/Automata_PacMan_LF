package Entities;

public enum Color {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String color_code;

    private Color(String color_code){
        this.color_code = color_code;
    }

    @Override
    public String toString() {
        return this.color_code;
    }

    public static void println(String text, Color color){
        System.out.println(color + text + Color.RESET);
    }
}
