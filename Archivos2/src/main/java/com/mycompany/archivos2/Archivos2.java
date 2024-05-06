
package com.mycompany.archivos2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos2 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        file.createNewFile(); //TODO: Crear un método para crear archivos y manejar la excepcion
        
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        
        for(int i=0; i<10;i++){
            pw.println("Linea "+ i);
        }
        
        writer.close();
    }
}
