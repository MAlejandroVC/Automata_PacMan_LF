import Entities.Ghost;
import Entities.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman extends JPanel implements KeyListener {

    Player player = new Player("Pacman.png", 0, 0);
    Ghost[] ghosts = new Ghost[4];

    public Pacman(){
        addKeyListener(this);
        setFocusable(true);

        ghosts[0] = new Ghost("Ghost_Red.png", 200, 200);
        ghosts[1] = new Ghost("Ghost_Red.png", 150, 150);
        ghosts[2] = new Ghost("Ghost_Red.png", 300, 100);
        ghosts[3] = new Ghost("Ghost_Red.png", 50, 300);
    }

    public void paintComponent(Graphics g){
        player.draw(g, this);
        for(Ghost ghost: ghosts){
            ghost.draw(g, this);
        }
    }

    public void update() {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        new Thread( () -> {
            while (true){
                update();
                try{
                    Thread.sleep(10);
                }catch(InterruptedException err){
                    err.printStackTrace();
                }
            }
        }).start();

        int SPEED = 4;

        if(e.getKeyCode() == KeyEvent.VK_RIGHT && player.x < (getWidth() - player.width)){
            player.x += SPEED;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT && player.x > 0){
            player.x -= SPEED;
        }

        if(e.getKeyCode() == KeyEvent.VK_UP && player.y > 0){
            player.y -= SPEED;
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN && player.y < (getHeight() - player.height)){
            player.y += SPEED;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
