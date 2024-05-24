
package com.mycompany.inheritance.people;

public class Administrative extends Person {
    private String dependecy;

    public Administrative(String dependecy, String ID, String name, int age) {
        super(ID, name, age);
        this.dependecy = dependecy;
    }
    
    public void seeData() {
        System.out.println("Mostrar datos al administrativo");
    }
    
    public void fingerPrintRegistry() {
        System.out.println("Administrativo registrando huella");
    }
    
}
