public class Student {
  protected String name;
  protected String group;
  protected String studentId;

  public Student(String name, String group, String studentId) {
    this.name = name;
    this.group = group;
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }

  public String getGroup() {
    return group;
  }

  public String getStudentId() {
    return studentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    return studentId.equals(student.studentId);
  }

  @Override
  public int hashCode() {
    return studentId.hashCode();
  }
}
