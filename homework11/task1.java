package homework11;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class task1 {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Roman", "Peter", "Daniel", "Eric"};
        String joined = IntStream.range(0, names.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names[i])
                .collect(Collectors.joining(", "));
        System.out.println(joined);


    }
}
