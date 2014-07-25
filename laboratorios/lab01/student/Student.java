package laboratorios.lab01.student;
import laboratorios.lab01.Human;
import java.io.*;

public class Student extends Human {

  public Student (String name) {
  	nombre = name;
  }

  public void learn () {
    System.out.println(nombre + " is learning !!!!!!!!!");
  }

  public String toString() {
    return nombre;
  }

}