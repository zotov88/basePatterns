import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        List<String> list = Arrays.asList("One", "Two", "Three");
//        Stream<String> stream = Stream.of("One", "Two", "Three");
        list.forEach(System.out::println);
    }
}
