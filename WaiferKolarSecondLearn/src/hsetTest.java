import java.util.HashSet;
import java.util.Spliterator;

public class hsetTest {
    public static void main(String[] args) {
//        HashSet<Integer> hset = new HashSet<>();
//        hset.add(32);
//        hset.add(33);
//        hset.add(34);
//        hset.add(35);
//        hset.add(36);
//        hset.add(37);
//
//        Spliterator numbers = hset.spliterator();
//        numbers.forEachRemaining((n)-> System.out.println(n ));
        HashSet<String> hset = new HashSet<>();
        hset.add("Mg Mg");
        hset.add("Aung Aung");
        hset.add("Tun Tun");
        hset.add("Su Su");
        hset.add("Aye Aye");
        hset.add("Mya Mya");

//        Spliterator numbers = hset.spliterator();
//        numbers.forEachRemaining((n)-> System.out.println(n ));

        HashSet<String> mySet = (HashSet<String>) hset.clone();
        Spliterator names = hset.spliterator();
        names.forEachRemaining((n) -> System.out.println(n));
    }
}
