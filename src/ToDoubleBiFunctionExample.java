import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> a + b;
        System.out.println(toDoubleBiFunction.applyAsDouble(1, 2));
    }
}
