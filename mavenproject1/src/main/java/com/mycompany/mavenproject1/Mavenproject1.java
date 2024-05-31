
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.being.Human;

public class Mavenproject1 {

    public static void main(String[] args) {
        Human human = new Human(170, "Fulanito");
        
        human.walk();
        human.fly();
    }
}
