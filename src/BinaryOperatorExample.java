import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        String result = binaryOperator.apply("Hello", " World");
        System.out.println(result);
    }
}
