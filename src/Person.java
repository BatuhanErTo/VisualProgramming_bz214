import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    private String tckn;
    private String name;
    private int age;

    public Person(String tckn, String name, int age) {
        this.tckn = tckn;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return tckn + " " + name + " " + age;
    }

    @Override
    public int compareTo(Person other) {
        return this.tckn.compareTo(other.tckn);
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("2000", "Ali", 20));
        people.add(new Person("1000","Tuna",30));
        people.add(new Person("4000","Kaan",18));
        System.out.println(people);

        Collections.sort(people); //sort people list according to compareTo method (natural ordering)
        System.out.println(people);

        PersonAgeComparator ageComparator = new PersonAgeComparator();
        Collections.sort(people,ageComparator); //sort people list according to ageComparator
        System.out.println(people);
    }
}
