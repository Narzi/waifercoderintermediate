import java.util.HashSet;
import java.util.Spliterator;

public class HashTest {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(32);
        hset.add(33);
        hset.add(34);
        hset.add(35);
        hset.add(36);
        hset.add(37);

        System.out.println(hset.size());

        Spliterator numbers = hset.spliterator();

        numbers.forEachRemaining((n) -> System.out.println(n));




    }
}
