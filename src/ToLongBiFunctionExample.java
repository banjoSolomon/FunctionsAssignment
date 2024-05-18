import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> (long) a * b;
        System.out.println(toLongBiFunction.applyAsLong(1, 2));
    }
}
