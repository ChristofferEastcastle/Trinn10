import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Program pgr = new Program();
        pgr.addTwoPeople();
        Optional<Person> opt1 = pgr.getSamplePerson("Atle Antonsen");
        Optional<Person> opt2 = pgr.getSamplePerson("Atle Bergtun");

        Person p1 = new Person("Testnavn", -21);
        Person p2 = new Person("Testnavn", 21);
        Person p3 = new Person("Test3", 11);
        Person p4 = new Person("Test4", 14);
        Person p5 = new Person("Test5", 19);
        Person p6 = new Person("Testnavn", -221);
        Person p7 = new Person("testing", 221);
        Person p8 = new Person();
        p8.setAge(24);
        p8.setName("Bård");

        System.out.println(pgr.addPerson(p1));
        System.out.println(pgr.addPerson(p2));
        System.out.println(pgr.addPerson(p3));
        System.out.println(pgr.addPerson(p4));
        System.out.println(pgr.addPerson(p5));
        System.out.println(pgr.addPerson(p6));
        System.out.println(pgr.addPerson(p7));
        System.out.println(pgr.addPerson(p8));
        System.out.println("Printer alle");
        pgr.printSet();

        Set<Person> newSet = pgr.getByAgeOlderThan(20);
        System.out.println();
        System.out.println("Printer alle over alderen 20");
        newSet.forEach(person -> System.out.println(person.toString()));
    }
}