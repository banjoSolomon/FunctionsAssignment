import java.util.function.DoubleToIntFunction;

public class DoubleToIntExample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (number) -> Double.valueOf(number).intValue();
        System.out.println(doubleToIntFunction.applyAsInt(1.5));
    }
}
