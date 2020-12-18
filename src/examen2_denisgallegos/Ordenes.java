/*Clase para el objeto ORDENES.
 */
package examen2_denisgallegos;

import java.io.Serializable;
import java.util.Random;


public class Ordenes implements Serializable{
    
    private int idorden; 
    private int pollo; 
    private int biscuit; 
    private int pure;
    private int papas;
    private int refresco;
    private int pie; 

    public Ordenes() {
    }
    
    public Ordenes(int pollo, int biscuit, int pure, int papas, int refresco, int pie) {
        this.pollo = pollo;
        this.biscuit = biscuit;
        this.pure = pure;
        this.papas = papas;
        this.refresco = refresco;
        this.pie = pie;
        generaridorden();
    }
    
    public void  generaridorden(){
        String n = "";
        for (int c= 0; c < 5;c++){
            Random aleatorio = new Random();
            n += 1 + aleatorio.nextInt(9)+""; 
        }
        idorden = Integer.parseInt(n);
    }
    
    //MUTADORES: 

    public int getIdorden() {
        return idorden;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }
    
    
    public int getPollo() {
        return pollo;
    }

    public void setPollo(int pollo) {
        this.pollo = pollo;
    }

    public int getBiscuit() {
        return biscuit;
    }

    public void setBiscuit(int biscuit) {
        this.biscuit = biscuit;
    }

    public int getPure() {
        return pure;
    }

    public void setPure(int pure) {
        this.pure = pure;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getRefresco() {
        return refresco;
    }

    public void setRefresco(int refresco) {
        this.refresco = refresco;
    }

    public int getPie() {
        return pie;
    }

    public void setPie(int pie) {
        this.pie = pie;
    }
    
    //MA: 
    
    public String toStringOrdenes(){
        return "Orden: "+idorden+", Piezas: "+pollo+", Refrescos: "+refresco+"\n"+
                ", Papas: "+papas+", Biscuits: "+biscuit+", Pures: "+pure+"Pies: "+pie;
    }
    
    
}//Fin de la clase.
