
package ejercicios.parcialpractica.files;

import ejercicios.parcialpractica.people.Student;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterFile {
    private File file;
    private FileWriter fw;
    private PrintWriter pw;

    public WriterFile(File file) throws IOException {
        this.file = file;
        this.fw = new FileWriter(file, true);
        this.pw = new PrintWriter(fw);
    }
    
    public void writeData(File file,Student student) throws IOException{
        String act="";
        for(int i=0;i<student.getActivities().size();i++){
            act+= student.getActivities().get(i);
        }
        pw.println(student.getName()+";"+student.getLastname()+";"+student.getCode()+";"+act);
        fw.close();
    }
}
