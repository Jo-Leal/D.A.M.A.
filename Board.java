import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.io.File;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    
    
    private boolean isPlaying = false;
    private JButton ok;

    private Font font;
    private Tabuleiro t;
    private Peca p;
       
    public Board() {

        addKeyListener(new TAdapter());
        
        setFocusable(true);        
        setDoubleBuffered(true);
        setBackground(Color.WHITE);

          
        t = new Tabuleiro();
        p = new Peca();
        timer = new Timer(5, this);
        timer.start();
    }
    
    public void newGame() {
        isPlaying = true;
        setBackground(Color.BLACK);
    }
    
    public void startScreen() {
        ok = new JButton("INICIAR");
        add(ok);
        isPlaying = false;
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        paintBoard(g);
        paintIntro(g);
    }
    
    public void paintBoard(Graphics g) {
        if(isPlaying == true) {
            Graphics2D g2d = (Graphics2D) g;
            t.desenhaTabuleiro(g2d);
        }   
    }


    public void paintIntro(Graphics g) {
        if(isPlaying == false){
            isPlaying = false;
            Graphics2D g2d = (Graphics2D) g;
            try{
                File file = new File("fonts/vinet.ttf");
                font = Font.createFont(Font.TRUETYPE_FONT, file);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(font);
                font = font.deriveFont(Font.PLAIN,40);
                g2d.setFont(font);
            }catch (Exception e){
                System.out.println(e.toString());
            }   
            g2d.drawString("D.A.M.A. " , 180, 200);
        }
    }
    
    public void actionPerformed(ActionEvent e) {        
        repaint();  
    }
    
    
    private class TAdapter extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int key =  e.getKeyCode();

            switch (key){
                case KeyEvent.VK_ENTER:
                    if (isPlaying) {
                        startScreen();
                    } else {
                        newGame();
                    }
                    break;
                    
                case KeyEvent.VK_LEFT:
                    break;
                    
                case KeyEvent.VK_RIGHT:
                    break;
                    
                case KeyEvent.VK_UP:
                    break;
                    
                case KeyEvent.VK_DOWN:
                    break;
            }
            
        }
    }
    
}
