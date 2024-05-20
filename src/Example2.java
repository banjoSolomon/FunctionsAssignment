import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDDFG", "ABCDEF", "ABC");
        numbers.stream().map(String::length).forEach(System.out::println);
    }
}
