import java.util.function.LongSupplier;

public class LongSupplierExample {
    public static void main(String[] args) {
        LongSupplier longSupplier = () -> 35L;
        long value = longSupplier.getAsLong();
        System.out.println(value);


    }
}
