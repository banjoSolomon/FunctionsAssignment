import java.util.stream.IntStream;

public class Example3 {
    public static void main(String[] args) {
        String words = "Hello, world";
        words.chars().filter((number)->number>100).map((number)->number*number).forEach(System.out::println);
    }
}
