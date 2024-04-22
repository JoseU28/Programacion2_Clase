
package com.mycompany.exceptions;
import java.util.*;
public class Calculator {

    public Calculator() {
    }
    
    public int division(int a, int b){
     /*   // Validación que evita la excepcion
        if(b<=0){
            System.out.println("Ñao Ñao (Operacion no permitida)");
            return -1;
        }
        */
        boolean repeat;
        int res=0;
        Scanner scanner =new Scanner(System.in);
        do {
            repeat=false;
            try{
                res= a/b;
            } catch(ArithmeticException e) {
                System.out.println("Operación no válida");
                System.out.println("Ingrese un nuevo valor b");
                try{
                    b= scanner.nextInt();
                } catch(InputMismatchException ex) {
                    System.out.println("Tipo de dato no válido");
                   System.out.println("Ingrese un nuevo valor b");
                    
                    repeat=true;
                }
            } catch(InputMismatchException e) {
                System.out.println("Tipo de dato no válido");
                
                b= scanner.nextInt();
                repeat=true;
            } finally {
                scanner.nextLine();
            }
        } while(repeat);
        return res;
    }
}
