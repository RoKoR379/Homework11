package homework11;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        List<String> list = List.of("1, 2, 0", "4, 5");
        List<String> result;
        result = list.stream()
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
