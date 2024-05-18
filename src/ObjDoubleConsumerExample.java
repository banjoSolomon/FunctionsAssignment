import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {
    public static void main(String[] args) {
        ObjDoubleConsumer objDoubleConsumer = (obj, doubleValue) -> System.out.println(obj + " " + doubleValue);
        objDoubleConsumer.accept("Welcome", 1.2);
    }
}
