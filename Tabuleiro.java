import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Tabuleiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tabuleiro {
    /**
    * Este m�todo desenha o score 
    * 
    * @param  Graphics g    
    * @return     void
    */
    public void desenhaTabuleiro(Graphics2D pincel) {
        pincel.setColor(Color.WHITE);
        //linha1
        
        
        pincel.fillRect(0,0,75,75);
        pincel.fillRect(0,150,75,75);
        pincel.fillRect(0,300,75,75);
        pincel.fillRect(0,450,75,75);

        //linha2
        
       
        
        pincel.fillRect(75,75,75,75);
        pincel.fillRect(75,225,75,75);
        pincel.fillRect(75,375,75,75);
        pincel.fillRect(75,525,75,75);
         

        //linha3
        
       

        pincel.fillRect(150,0,75,75);
        pincel.fillRect(150,150,75,75);
        pincel.fillRect(150,300,75,75);
        pincel.fillRect(150,450,75,75);

        //linha 4

       

        pincel.fillRect(225,75,75,75);
        pincel.fillRect(225,225,75,75);
        pincel.fillRect(225,375,75,75);
        pincel.fillRect(225,525,75,75);

        //linha 5
       

        pincel.fillRect(300,0,75,75);
        pincel.fillRect(300,150,75,75);
        pincel.fillRect(300,300,75,75);
        pincel.fillRect(300,450,75,75);

        //linha6
        
        pincel.fillRect(375,75,75,75);
        pincel.fillRect(375,225,75,75);
        pincel.fillRect(375,375,75,75);
        pincel.fillRect(375,525,75,75);
        //linha 7

        
        pincel.fillRect(450,0,75,75);
        pincel.fillRect(450,150,75,75);
        pincel.fillRect(450,300,75,75);
        pincel.fillRect(450,450,75,75);

       
        pincel.fillRect(525,75,75,75);
        pincel.fillRect(525,225,75,75);
        pincel.fillRect(525,375,75,75);
        pincel.fillRect(525,525,75,75);
        
         ////////////////////////////////////////////
        
         //pe�a azul
        pincel.setColor(Color.BLUE);
        pincel.fillOval(455,80,60,60);
        pincel.fillOval(530,5,60,60);
        pincel.fillOval(305,80,60,60);
        pincel.fillOval(380,5,60,60);

        pincel.fillOval(155,80,60,60);
        pincel.fillOval(230,5,60,60);
        pincel.fillOval(5,80,60,60);
        pincel.fillOval(80,5,60,60);

        pincel.fillOval(80,155,60,60);
        pincel.fillOval(230,155,60,60);
        pincel.fillOval(380,155,60,60);
        pincel.fillOval(530,155,60,60);
        ///////////////////////////////////////
        //pe�a vermelha
        pincel.setColor(Color.RED);

        pincel.fillOval(530,455,60,60);
        pincel.fillOval(380,455,60,60);
        pincel.fillOval(230,455,60,60);
        pincel.fillOval(80,455,60,60);

        pincel.fillOval(455,380,60,60);
        pincel.fillOval(305,380,60,60);
        pincel.fillOval(155,380,60,60);
        pincel.fillOval(5,380,60,60);

        pincel.fillOval(455,530,60,60);
        pincel.fillOval(305,530,60,60);
        pincel.fillOval(155,530,60,60);
        pincel.fillOval(5,530,60,60);


    }
}
