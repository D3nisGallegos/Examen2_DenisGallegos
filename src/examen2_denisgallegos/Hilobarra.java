/*
 */
package examen2_denisgallegos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


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
            barra.setMaximum(4);
            for (int j = 1; j <= 4;j++){
                contador++;
                barra.setValue(j);
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Pieza de pollo", 4+""};
                m.addRow(row);
                tabla.setModel(m);
            barra.setValue(0);
        }
        for (int c = 0; c < orden.getRefresco();c++){
            barra.setMaximum(1);
            for (int j = 1; j <= 1;j++){
                contador++;
                barra.setValue(j);
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Refresco", 1+""};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int c = 0; c < orden.getBiscuit();c++){
            barra.setMaximum(1);
            for (int j = 1; j <= 1;j++){
                contador++;
                barra.setValue(contador);
                
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Biscuit", 1+""};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int c = 0; c < orden.getPapas();c++){
            barra.setMaximum(3);
            for (int j = 1; j <= 3;j++){
                contador++;
                barra.setValue(contador);
                
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Papas fritas", 3+""};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
        }
        for (int c = 0; c < orden.getPure();c++){
            barra.setMaximum(2);
            for (int j = 1; j <= 2;j++){
                contador++;
                barra.setValue(contador);
                
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Pure", 2+""};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
        }
        for (int c = 0; c < orden.getPie();c++){
            barra.setMaximum(5);
            for (int j = 1; j <= 5;j++){
                contador++;
                barra.setValue(contador);
                
                try {
                    Thread.sleep(1150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilobarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
                String [] row = {orden.getIdorden()+"", "Pie", 5+""};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
        }
            barra.setValue(0);
            JOptionPane.showMessageDialog(null, "Orden procesada exitosamente.");
        
    }//Fin del hilo.
    
    
    
    
}//Fin de la clase.
