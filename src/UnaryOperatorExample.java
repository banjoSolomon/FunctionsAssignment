import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (String s) -> s.toUpperCase();
        System.out.println(unaryOperator.apply("hello"));
    }
}
