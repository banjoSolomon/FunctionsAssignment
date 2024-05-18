import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = x -> x * 2;
        System.out.println(doubleUnaryOperator.applyAsDouble(2.0));
    }
}
