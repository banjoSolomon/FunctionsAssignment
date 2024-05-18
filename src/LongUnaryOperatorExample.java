import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorExample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = (number)-> 4 * number;
        long result = longUnaryOperator.applyAsLong(10L);
        System.out.println(result);


    }
}
