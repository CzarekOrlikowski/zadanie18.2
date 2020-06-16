package pl.javastart.exercise.streams;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidNames = ppl.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(toList());
        return kidNames;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List <User> usersCollection = people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()))
                .collect(toList());
        return usersCollection;
    }
}
