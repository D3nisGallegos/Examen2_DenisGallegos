/*
 */
package examen2_denisgallegos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AdminBinario implements Serializable{
    
    private ArrayList clientes = new ArrayList();
    private File archivo = null;
    
    public AdminBinario(String path) {
        archivo = new File(path);
    }
    
    //MUTADORES:
    public ArrayList getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //MA: 
    public void cargarArchivo() {
        try {            
            clientes = new ArrayList();
            Clientes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clientes) objeto.readObject()) != null) {
                        clientes.add(temp);
                    }                   
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            //for (Object t : clientes) {
                //bw.writeObject(t);
            //}
            for (int c =0; c < clientes.size();c++){
                Clientes cliente = (Clientes) clientes.get(c);
                bw.writeObject(cliente);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
    
}//Fin de la clase.
