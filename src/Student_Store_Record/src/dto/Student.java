package dto;

public class Student {
    private int Id;
    private String Name;
    private String Email;
    private String StudentId;
    private int StudentRollNumber;

    public Student() {
    }

    public Student(String Name, String Email, String StudentId, int StudentRollNumber) {
        this.Name = Name;
        this.Email = Email;
        this.StudentId = StudentId;
        this.StudentRollNumber = StudentRollNumber;
    }

    public Student(int Id, String Name, String Email, String StudentId, int StudentRollNumber) {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.StudentId = StudentId;
        this.StudentRollNumber = StudentRollNumber;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getStudentId() {
        return this.StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public int getStudentRollNumber() {
        return this.StudentRollNumber;
    }

    public void setStudentRollNumber(int StudentRollNumber) {
        this.StudentRollNumber = StudentRollNumber;
    }

    public void showStudentInfo() {
        System.out.println(Id + " \t" + Name + "\t" + Email + "\t" + StudentId + "\t" + StudentRollNumber);
    }

}
