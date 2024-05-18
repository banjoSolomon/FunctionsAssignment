import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {
    public static void main(String[] args) {
        ObjIntConsumer objIntConsumer = (obj, value) -> System.out.println("obj = " + obj + ", value = " + value);
        objIntConsumer.accept("Hello", 5);
    }
}
