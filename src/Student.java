public class Student {
    private String name;
    private String studentNumber;

    public Student(String newName, String newStudentNumber){
        name = newName;
        studentNumber = newStudentNumber;
    }

    public String GetName(){
        return name;
    }

    public String getStudentNumber(){
        return studentNumber;
    }
}
