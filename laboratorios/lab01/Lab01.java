import laboratorios.lab01.student.Student;
import laboratorios.lab01.teacher.Teacher;

public class Lab01 {
  public static void main(String[] args) {
    Teacher teacher;
    int students = 0;

    try {
      students = Integer.parseInt(args[0]);
    } catch (NumberFormatException nfe) {
      System.err.println("ERROR NUMERO NO VALIDO ");
      System.exit(1);
    } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.err.println("ERROR ");
      System.exit(1);
    } catch (Exception e) {
      System.err.println("ERROR ");
      System.exit(1);
    }

    teacher = new Teacher("The Teacher");
    for (int i = 0; i < students; i++)  teacher.addStudent(new Student("Student #" + (i+1)));
    teacher.teach();
  }
}