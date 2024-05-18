import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {
    public static void main(String[] args) {
        IntToDoubleFunction intToDoubleFunction = (number) -> 50;
        double result = intToDoubleFunction.applyAsDouble(50);
        System.out.println(result);

    }
}
