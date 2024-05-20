
package com.mycompany.taller3;

import com.mycompany.taller3.mannagefiles.ReadFiles;
import com.mycompany.taller3.mannagefiles.WriteFiles;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Taller3 {

    public static void main(String[] args) throws IOException {
        String frase2=null;
        File file = new File("./archivo1.txt");
        file.createNewFile();
        ReadFiles readFiles = new ReadFiles(file);
        List<String> data = readFiles.loadData();
        File file2 = new File("./archivo2.txt");
        file2.createNewFile();
        WriteFiles writeFiles = new WriteFiles(file2);

        for(String line: data){
            frase2 = line.replace('o', '0').replace('e', '3');
            writeFiles.writeData(file2, frase2);
            System.out.println(frase2);
        }
    }
        
}
