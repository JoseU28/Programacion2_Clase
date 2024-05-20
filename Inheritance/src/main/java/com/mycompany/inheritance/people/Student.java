
package com.mycompany.inheritance.people;

public class Student extends Person {
    private String carreer;
    private int semester;
    private float average;

    public Student(String carreer, int semester, float average, String ID, String name, int age) {
        super(ID, name, age);
        this.carreer = carreer;
        this.semester = semester;
        this.average = average;
    }
    
    public void seeGrades() {
        System.out.println("Viendo lista de notas del estudiante");
    }
    public void registerSubjects() {
        System.out.println("Registrar materias del estudiante");
    }
    public void cancelSubjects() {
        System.out.println("Cancelar materias del estudiante");
    }
}
