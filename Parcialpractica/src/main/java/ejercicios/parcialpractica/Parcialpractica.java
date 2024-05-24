
package ejercicios.parcialpractica;

import ejercicios.parcialpractica.activities.Activity;
import ejercicios.parcialpractica.files.Reader;
import ejercicios.parcialpractica.files.WriterFile;
import ejercicios.parcialpractica.people.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parcialpractica {

    public static void main(String[] args) throws IOException {
        Scanner cap= new Scanner(System.in);
        Scanner caps= new Scanner(System.in);
        List<String> data;
        int i=0;
        int c1=0;
        int c2=0;
        int c3=0;
        String acti="";
        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        File file = new File("./students1.txt");
        file.createNewFile();
        
        Reader reader = new Reader(file);
        WriterFile writer = new WriterFile(file);
        Student student = new Student();
        
        ArrayList<String> activities = new ArrayList<>();
        ArrayList<String> codes = new ArrayList<>();
        
        
        
            System.out.println("Qué deseas hacer?");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Ver Lista de estudiantes");
            System.out.println("3. Ver cantidad de estudiantes por actividad");
            System.out.println("4. Ver cantidad de estudiantes inscritos");
            System.out.println("5. Salir");
            int act = cap.nextInt();
            switch (act){
                case 1:
                    System.out.println("Ingrese su nombre");
                    student.setName(caps.nextLine());
                    System.out.println("Ingrese su apellido");
                    student.setLastname(caps.nextLine());
                    System.out.println("Elija la actividad que desea realizar");
                    System.out.println("1. Baloncesto");
                    System.out.println("2. Patinaje");
                    System.out.println("3. Futbol");
                    int elect = cap.nextInt();
                    switch(elect){
                        case 1:
                            acti="Baloncesto";
                            break;
                        case 2:
                            acti="Patinaje";
                            break;
                        case 3:
                            acti="Futbol";
                            break;
                        default:
                            System.exit(0);
                    }
                    activities.add(acti);
                    student.setActivities(activities);
                    String namecomplete = " "+student.getName() +" "+ student.getLastname();
                    int rand = (int)(Math.random() * range) + min;
                    String [] generar = namecomplete.split(" ");
                    String code = "";
                    for(String gen:generar){
                        String words[] = gen.split("");
                        code += words[0];
                    }
                    code += String.valueOf(rand);
                    student.setCode(code);
                    writer.writeData(file, student);
                    break;
                case 2:
                    data=reader.loaddata();
                    for(String dato:data){
                        String[] splited = dato.split(";");
                        System.out.println(splited[0]+" "+splited[1]+"  -  "+splited[2]);
                    }
                    break;
                case 3:
                    data=reader.loaddata();
                    for(String dato:data){
                        String[] splited = dato.split(";");
                        if(splited[3].equals("Baloncesto")){
                            c1++;
                        }
                        else if(splited[3].equals("Patinaje")){
                            c2++;
                        }
                        else if(splited[3].equals("Patinaje")){
                            c3++;
                        }
                    }
                    System.out.println("Actividad  --- Inscritos");
                    System.out.println("Baloncesto"+"  ---  "+c1);
                    System.out.println("Patinaje"+"  ---  "+c2);
                    System.out.println("Futbol"+"  ---  "+c3);
                    break;
                case 4:
                    data=reader.loaddata();
                    System.out.println("La cantidad de estudiantes inscritos es de:"+ data.size());
                    break;
                case 5:
                    
                    break;
            }
        
    }
}
