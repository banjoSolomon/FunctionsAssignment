import java.util.function.ObjLongConsumer;

public class ObjLongConsumerExample {
    public static void main(String[] args) {
        ObjLongConsumer objLongConsumer = (obj, longValue) -> System.out.println("obj = " + obj + ", longValue = " + longValue);
        objLongConsumer.accept(10L, 20L);
    }
}
