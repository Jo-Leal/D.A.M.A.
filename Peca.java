import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Tabuleiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peca {
    private boolean selecionado;
    private Color cor;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 60;
    public Peca(Color cor){
        this.selecionado = false;
        this.cor = cor;
    }
    
    //public void desenhaPeca(Graphics2D pincel, String color){
        
    //}
    
    /**
    * Este método desenha o score 
    * 
    * @param  Graphics g    
    * @return     void
    */
    public void desenhaTabuleiro(Graphics2D pincel) {
         //peça azul
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
        //peça vermelha
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
