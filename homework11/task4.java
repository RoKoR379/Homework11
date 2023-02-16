package homework11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task4 {

    public static Stream<Long> iterator(Long a, Long m, Long c){
        Stream<Long> stream = Stream.iterate(0L, x -> (a * x + c) % m);
        return stream.limit(7);
    }

    public static void main(String[] args) {

        System.out.println(iterator(25214903917L, 2^48L, 11L).collect(Collectors.toList()));
    }
}
