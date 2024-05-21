import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example7 {
    public static void main(String[] args) {
        String words = "Hello, world";
        byte[] byteArray = words.getBytes();

        LongStream lStream = IntStream.range(0, byteArray.length)
                .mapToLong(i -> byteArray[i]);

        lStream.forEach(System.out::println);



    }
}
