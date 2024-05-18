import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(5, 9));

    }
}
