import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<Student> students = new HashSet();

    System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("end")) {
        break;
      } else {
        String[] stdArr = input.split(", ");
        Student st = new Student(stdArr[0], stdArr[1], stdArr[2]);
        if (!students.contains(st)) {
          students.add(st);
        } else {
          System.out.println("Студент с таким номером уже есть в списке");
        }
        System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
      }
    }
    System.out.println("Список студентов:");
    for (Student st : students) {
      System.out.println(st.getName() + ", " + st.getGroup() + ", " + st.getStudentId());
    }
  }
}
