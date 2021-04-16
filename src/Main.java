import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Посилання на статичний метод класу
        Person p1 = new Person(16, "Ivan", "no job");
        p1.changeAge(AgeChanger::toAdult);

        // Посилання на конструктор
        PersonCreator pc = Person::new;
        Person p2 = pc.create(22, "Lena", "driver");

        // Посилання на нестатичний метод класу
        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(p1, p2));
        persons.forEach(Person::addAge);

        // Посилання на нестатичний метод класу
        persons.forEach(System.out::println);
    }

    public static class AgeChanger{
        public static int toAdult(int age){
            if(age < 18){
                return 18;
            } else {
                return age;
            }
        }
    }
}
