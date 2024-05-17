
package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFiles.ReadFile;
import com.mycompany.csvfiles.manageFiles.WriteFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("./data.csv");
        file.createNewFile();
        ReadFile readFile = new ReadFile(file);

        WriteFile writefile = new WriteFile(file);
        writefile.writeData(file);
        
        List<String> data = readFile.loadData();
        for(String line: data){
//           System.out.println(line);
           String[] splited = new String[3];
           splited = line.split(";");
//           System.out.println(splited[0]);
           System.out.println("Hola "+splited[1] + " "+splited[2]+" tu código es: "+ splited[0]);
        }
    }
}
