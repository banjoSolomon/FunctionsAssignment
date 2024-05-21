import java.util.List;
import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "ABC", "HELLO", "HEY");

       System.out.println(list.stream().flatMap((element)-> Stream.of(new StringBuilder(element).reverse())).toList());
    }
}
