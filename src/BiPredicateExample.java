import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("Hello", "Hello"));
        System.out.println(biPredicate.test("Hello", "World"));
    }
}
