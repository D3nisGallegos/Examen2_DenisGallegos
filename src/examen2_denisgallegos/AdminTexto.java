/*
 */
package examen2_denisgallegos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdminTexto {
    
    private File archivo = null; 
    
    public AdminTexto(String path){
        this.archivo = new File(path);
    }
    
    //MUTADORES: 
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //MA: 
    public void Escribirarchivo(Ordenes orden, Clientes cliente) throws IOException{
        FileWriter escritor = null;
        BufferedWriter escritorenRAM = null;
        Date fecha = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        String n = f.format(fecha);
        try{
            escritor = new FileWriter(archivo,true);
            escritorenRAM = new BufferedWriter(escritor);
            escritorenRAM.write("FACTURA DE COMPRA: POPEYES");
            escritorenRAM.newLine();
            escritorenRAM.write("Fecha: "+n+"                         "+" ID de la orden: "+orden.getIdorden());
            escritorenRAM.newLine();
            escritorenRAM.write("DATOS DEL CLIENTE: ");
            escritorenRAM.newLine();
            escritorenRAM.write("Nombre del cliente: "+cliente.getNombre());
            escritorenRAM.newLine();
            escritorenRAM.write("********************************* L I S T A D O: ***************************************");
            escritorenRAM.newLine();
            escritorenRAM.write("Piezas de pollo: "+orden.getPollo());
            escritorenRAM.newLine();
            escritorenRAM.write("Refrescos: "+orden.getRefresco());
            escritorenRAM.newLine();
            escritorenRAM.write("Biscuits: "+orden.getBiscuit());
            escritorenRAM.newLine();
            escritorenRAM.write("Papas fritas: "+orden.getPapas());
            escritorenRAM.newLine();
            escritorenRAM.write("Pures: "+orden.getPure());
            escritorenRAM.newLine();
            escritorenRAM.write("Pies: "+orden.getPie());
            escritorenRAM.newLine();
            escritorenRAM.write("******************************************************************************************");
            escritorenRAM.newLine();
            escritorenRAM.flush();
        }catch(Exception e){ 
            
        }
        escritorenRAM.close();
        escritor.close();      
    }
}//Fin de la clase.
