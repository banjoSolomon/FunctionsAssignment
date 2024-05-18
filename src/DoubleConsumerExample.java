import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = (x) -> {
            double result = x * x;
            System.out.println(result);

        };
        doubleConsumer.accept(10.0);

    }
}
