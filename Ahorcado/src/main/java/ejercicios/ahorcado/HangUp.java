
package ejercicios.ahorcado;

public class HangUp {
    
    public char[] searchLetter(char letter,char[] wordar) throws Exception{
        if(Character.isDigit(letter)){
            System.out.println("Tienes que introducir una letra");
            return wordar;
        }
        else{
            for(int i=0;i<wordar.length;i++){
                if(letter==wordar[i]){
                    wordar[i]=' ';
                    System.out.println("La letra está en la palabra en la posición " + i );
                    System.out.println("");
                    return wordar;
                }
            }
            throw new Exception("La letra no está dentro de la palabra");
        }
    }
}
