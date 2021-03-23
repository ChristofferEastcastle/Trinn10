import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Program {
    private HashSet<Person> set = new HashSet<>();


    public void addTwoPeople(){
        set.add(new Person("Atle Antonsen", 20));
        set.add(new Person("Atle Antonsen", 20));
    }

    public Optional<Person> getSamplePerson(String name){
        for (Person p : set){
            if (Objects.equals(p.getName(), name))
                return Optional.of(p);
        }
        return Optional.empty();
    }

    public boolean addPerson(Person person){
        if (person == null || person.getName() == null || person.getAge() < 0)
            return false;

        return set.add(person);
    }

    public void printSet(){ set.forEach(person -> System.out.println(person.toString())); }

    public Set<Person> getByAgeOlderThan(int age){
        return set.stream().filter(person -> person.getAge() > age).collect(Collectors.toSet());
    }
}