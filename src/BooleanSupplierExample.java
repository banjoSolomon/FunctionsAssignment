import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> true ;
        boolean result = booleanSupplier.getAsBoolean();
        System.out.println(result);
    }
}
