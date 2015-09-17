import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Tabuleiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tabuleiro {
    private int x[] = new int[8];
    private int y[] = new int[8];
    private Peca pv[][] = new Peca[8][8];
    public Tabuleiro(){
        Color cor1 = new Color(255);
        for(int i = 1; i <= 7; i = i+2){
            pv[0][i] = new Peca(cor1.BLUE);
        }
        for(int i = 0; i <= 6; i = i+2){
            pv[1][i] = new Peca(cor1.BLUE);
        }
        for(int i = 1; i <= 7; i = i+2){
            pv[2][i] = new Peca(cor1.BLUE);
        }
        
        for(int i = 0; i <= 6; i = i+2){
            pv[5][i] = new Peca(cor1.RED);
        }
        for(int i = 1; i <= 7; i = i+2){
            pv[6][i] = new Peca(cor1.RED);
        }
        for(int i = 0; i <= 6; i = i+2){
            pv[7][i] = new Peca(cor1.RED);
        }
        
        int aux = 5;
        for(int i = 0; i <= 7; i++){
            x[i] = aux;
            y[i] = aux;
            aux = aux+75;
        }
        
       
    }
    
    /**
    * Este método desenha o score 
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
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < y.length; j++){
                if(pv[i][j] != null){
                    pv[i][j].desenhaPeca(pincel,x[j],y[i]);
                }
            }
        }

    }
}

