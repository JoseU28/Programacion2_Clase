
package com.mycompany.inheritance.people;

public class Teacher extends Person {
    private String [] subjects;

    public Teacher(String[] subjects, String ID, String name, int age) {
        super(ID, name, age);
        this.subjects = subjects;
    }
    
    public void seeStudentData() {
        System.out.println("Profesor viendo datos del estudiante");
    }
    
    public void setStudentGrades() {
        System.out.println("Profesor viendo notas del estudiante");
    }
}
