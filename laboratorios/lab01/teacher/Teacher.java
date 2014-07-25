package laboratorios.lab01.teacher;

import java.io.*;
import laboratorios.lab01.Human;
import laboratorios.lab01.student.Student;
import java.util.Vector;

public class Teacher extends Human {

  private Vector<Student> ListStudente;

  public Teacher(String name) {
    this.nombre = name;
    ListStudente = new Vector<Student>();
  }

  public void addStudent(Student st) {
    this.ListStudente.addElement(st);
  }

  public void teach() {
    System.out.println(this.nombre + " is teaching");
    for (Student st : ListStudente) st.learn();
  }

  public String toString() {
    return this.nombre;
  }

}