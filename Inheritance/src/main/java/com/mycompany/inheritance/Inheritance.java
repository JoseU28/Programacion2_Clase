
package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Administrative;
import com.mycompany.inheritance.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person = new Person("asd1","Ana", 30);
        System.out.print("Persona: ");
        person.fingerPrintRegistry();
        
        System.out.println("Hola tu nombre es: "+ person.getName());
        
        Administrative admin = new Administrative("Ingenierias", "aa1", "Pedro", 35);
        System.out.println("Hola, lo hemos identificado como: "+ admin.getName());
        System.out.print("Administrativo: ");
        admin.fingerPrintRegistry();
    }
}
