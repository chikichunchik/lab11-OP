import java.util.function.IntUnaryOperator;

public class Person {
    int age;
    String name;
    String job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public void addAge(){
        age++;
    }

    public void changeAge(IntUnaryOperator ref){
        age = ref.applyAsInt(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + job;
    }
}
