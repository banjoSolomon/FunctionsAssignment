import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {
        String words = "Hello, world";
        IntStream intStream = words.chars();
        intStream.forEach(System.out::println);
    }
}
