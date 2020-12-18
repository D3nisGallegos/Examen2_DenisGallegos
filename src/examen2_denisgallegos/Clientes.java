/*Clase para el objeto CLIENTES.
 */
package examen2_denisgallegos;

import java.io.Serializable;
import java.util.ArrayList;


public class Clientes implements Serializable{
    
    private String nombre; 
    private String clave;
    private ArrayList ordenes = new ArrayList();

    public Clientes() {
    }

    public Clientes(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }
    
    //MUTADORES:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList ordenes) {
        this.ordenes = ordenes;
    }
    
    //MA: 
    
    public String toStringClientes(){
        return "Nombre: "+nombre;
    }
    
    
}//fin de la clase.
