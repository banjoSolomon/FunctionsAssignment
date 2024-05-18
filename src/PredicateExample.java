import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 0;
        System.out.println(predicate.test("Hello"));

    }
}
