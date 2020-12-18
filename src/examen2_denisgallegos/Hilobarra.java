/*
 */
package examen2_denisgallegos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;


public class Hilobarra implements Runnable{

    private JProgressBar barra;
    private JTable tabla;
    private Ordenes orden; 

    public Hilobarra(JProgressBar barra, JTable tabla, Ordenes orden) {
        this.barra = barra;
        this.tabla = tabla;
        this.orden = orden;
    }
    
    
    
    @Override
    public void run() {
        int contador = 0; 
        int total = (orden.getPollo() * 4)+(orden.getRefresco()*1)+(orden.getBiscuit()* 1)+(orden.getPapas()*3)+
                (orden.getPure()*2)+(orden.getPie()*5);
        barra.setMaximum(total);
        for (int c = 0; c < orden.getPollo();c++){
            for (int j = 1; j <= 4;j++){
                contador++;
                barra.setValue(contador);
                System.out.println(barra.getValue());
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        for (int c = 0; c < orden.getRefresco();c++){
            for (int j = 1; j <= 1;j++){
                contador++;
                barra.setValue(contador);
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        for (int c = 0; c < orden.getBiscuit();c++){
            for (int j = 1; j <= 1;j++){
                contador++;
                barra.setValue(contador);
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        for (int c = 0; c < orden.getPapas();c++){
            for (int j = 1; j <= 3;j++){
                contador++;
                barra.setValue(contador);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        for (int c = 0; c < orden.getPure();c++){
            for (int j = 1; j <= 2;j++){
                contador++;
                barra.setValue(contador);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        for (int c = 0; c < orden.getPie();c++){
            for (int j = 1; j <= 5;j++){
                contador++;
                barra.setValue(contador);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        if (barra.getValue() == total){
            JOptionPane.showMessageDialog(null, "Orden procesada exitosamente.");
            barra.setValue(0);
        }
        
    }//Fin del hilo.
    
    
    
    
}//Fin de la clase.
