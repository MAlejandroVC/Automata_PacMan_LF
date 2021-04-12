import Entities.Color;

public class Test {
    public static void main(String[] args) {
        System.out.println(Color.RED + "This text is red!" + Color.RESET);
        System.out.println(Color.GREEN + "This text is green!");
        System.out.println(Color.WHITE + "This text is white!" + Color.RESET);
        System.out.println("This text is normal");

        Color.println("Hello World!", Color.RED);
        System.out.println("Hello World!");
    }
}
