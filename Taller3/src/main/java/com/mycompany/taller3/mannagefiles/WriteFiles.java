
package com.mycompany.taller3.mannagefiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFiles {
    private File file;
    private FileWriter fileWriter;
    private PrintWriter pw;
    
    public WriteFiles (File file) throws IOException{
        this.file = file;
        this.fileWriter = new FileWriter(file, true);
        this.pw = new PrintWriter(fileWriter);
    }
    
    public void writeData(File file, String line) throws IOException{
        pw.println(line);
        fileWriter.close();
    }
}
