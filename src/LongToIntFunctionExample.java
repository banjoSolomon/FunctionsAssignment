import java.util.function.LongToIntFunction;
import java.util.function.ToIntFunction;

public class LongToIntFunctionExample {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = (number) -> (int)  (2 * number);
        int result = longToIntFunction.applyAsInt(5L);
        System.out.println(result);
    }
}
