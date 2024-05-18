import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Hello"));

    }
}
