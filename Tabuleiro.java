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
    * Este método desenha o score 
    * 
    * @param  Graphics g    
    * @return     void
    */
    public void desenhaTabuleiro(Graphics2D pincel) {
        
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

    }
}
