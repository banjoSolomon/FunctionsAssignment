import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 4, 7, 1, 2, 3, 8, 9, 5, 6, 6, 9, 5, 3);
      List<Integer> result =  numbers.stream().distinct().sorted().toList();
      System.out.println(result);
    }

}
