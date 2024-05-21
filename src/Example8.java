import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2, 3, 8, 9, 5, 6, 6, 9, 5, 3);
        numbers.stream().map((number) ->String.format("number = %d",number)).forEach(System.out::println);
    }
}
