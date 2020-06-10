package pl.javastart.exercise.streams;

import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidNames = ppl.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
        return kidNames;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<String> nickNames = List.of("Tomek_2", "Ania_18", "Konrad_44", "Janusz_52", "Sebastian_16");
        nickNames.stream();
        people.stream();
        return null;
    }
}
