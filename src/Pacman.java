import Entities.*;

import javax.swing.*;

public class Pacman {
    public static void main(String[] args) {
        Player player = new Player("<", Color.YELLOW, 0, 0);
        Ghost[] ghosts = new Ghost[4];
        ghosts[0] = new Ghost("&", Color.GREEN, 0, 0);
        ghosts[1] = new Ghost("&", Color.RED, 0, 0);
        ghosts[2] = new Ghost("&", Color.PURPLE, 0, 0);
        ghosts[3] = new Ghost("&", Color.CYAN, 0, 0);

        JFrame frame = new JFrame("Pacman");
    }
}
