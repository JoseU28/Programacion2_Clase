
package ejercicios.ahorcado;
import java.util.*;
public class Ahorcado {

    public static void main(String[] args) {
        String word = "Pinga";
        char[] wordar=new char[5];
        HangUp hangup = new HangUp();
        
        for(int i=0;i<wordar.length;i++){
            wordar[i]=Character.toUpperCase(word.charAt(i));
        }
        
/*        System.out.println("La palabra es: ");
        for(int i=0;i<wordar.length;i++){
            System.out.print(wordar[i]);
        }
        System.out.println(""); */

        boolean live= true;
        Scanner cap=new Scanner(System.in);
        int lifes=5;
        System.out.println("Adivina la palabra de 5 letras");
        System.out.println("");
        do{
            System.out.println("Ingresa una letra");
            char letter = cap.nextLine().charAt(0);
            letter = Character.toUpperCase(letter);
            try{
                hangup.searchLetter(letter,wordar);  
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                lifes--;
                System.out.println("Te quedan "+lifes+" vidas");
                System.out.println("");
            }
            int cont=0;
            for(int i=0;i<wordar.length;i++){
                if(wordar[i]==' '){
                    cont++;
                    if(cont==5){
                        live=false;
                        System.out.println("Has ganado, la palabra era "+word);
                    }
                }
            }
            if(lifes==0){
                live=false;
            }
        }while(live);
    }
}
