import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class streamApi {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> s1 = nums.stream();
          
        s1.forEach(n -> System.out.println(n));
        s1.forEach(n -> System.out.println(n));
    }
}
 