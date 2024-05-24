
package ejercicios.parcialpractica.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private File file;
    private FileReader fr;
    private BufferedReader br;

    public Reader(File file) throws FileNotFoundException {
        this.file = file;
        this.fr = new FileReader(file);
        this.br = new BufferedReader(fr);
        
    }
    
    public List loaddata(){
        String line= null;
        List<String> data = new ArrayList<>();
        
        try {
            while((line = br.readLine()) != null){
                data.add(line);
            }
        } catch(IOException e){
            
        } finally {
            try {
                if(fr != null) {
                    fr.close();
                }
            } catch(IOException e2){
                
            }
        }
        return data;
    }
}

