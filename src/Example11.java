import java.util.List;
import java.util.stream.IntStream;

public class Example11 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);
       var start = numbers.stream().flatMapToInt((element)-> IntStream.of(element*2)).average();
        System.out.println(start);

    }
}
