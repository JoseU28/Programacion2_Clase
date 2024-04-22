
package com.mycompany.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.division(2,0);
//        try {
//            int res = calculator.division(4,2 );
//            System.out.println(res); 
//        } catch(Exception exception) {
//            System.out.println("Ha ocurrido un problema");
//            System.out.println(exception);
////            int res=2/0;
//        } finally {
//            System.out.println("Finally executed");
//        }      
//        System.out.println("Fuer del bloque Try");
        
      /*  try {
            int[] numbers= new int[3];
            numbers[5] = 2/0;
        } catch(ArithmeticException e) {
            System.out.println("Operacion no permitida");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición de array no valida");
        } catch(Exception e) {
            System.out.println("Ha ocurrido un error");
        } */
    }
    
    
}
