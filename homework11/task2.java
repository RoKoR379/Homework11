package homework11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {
        List sortedString =
                Stream.of("Ivan", "Roman", "Peter", "Daniel", "Eric")
                        .sorted(Comparator.reverseOrder())
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(sortedString);

    }
}
