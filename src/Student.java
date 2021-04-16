public class Student extends Person{
    String university;
    public Student(int age, String name, String job, String university) {
        super(age, name, job);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
