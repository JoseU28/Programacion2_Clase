
package com.mycompany.csvfiles.manageFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    private File file;
    private FileWriter fileWriter;
    private PrintWriter pw;

    public WriteFile(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file); 
        this.pw = new PrintWriter(fileWriter);
    }
    
    public void writeData(){
        pw.println("Queso");
        
    }
    
    
    
}
