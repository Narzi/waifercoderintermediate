import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Mg Mg ");
        names.add(" Aung Aung ");
        names.add(" Tun Tun");
        names.add(" Su SU");
        names.add("Mya Mya ");
        names.add("Aye AYe");


        Spliterator spliterator = names.spliterator();
        spliterator.forEachRemaining((n)-> System.out.println(n));

    }
}
