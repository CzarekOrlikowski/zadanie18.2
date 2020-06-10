package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> filteredCollection = numberList.stream()
                .filter(numbers -> numbers % 2 == 0)
                .collect(Collectors.toList());
        return filteredCollection;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> filteredCollection = numberList.stream()
                .filter(numbers -> numbers > 20)
                .collect(Collectors.toList());
        return filteredCollection;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> booksCollection = titles.stream()
                .map(Book::new)
                .collect(Collectors.toList());
        return booksCollection;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> filteredBooksCollection = titles.stream()
                .map(Book::new)
                .filter(book -> book.getTitle().startsWith("Gra"))
                .collect(Collectors.toList());
        return filteredBooksCollection;
    }
}
