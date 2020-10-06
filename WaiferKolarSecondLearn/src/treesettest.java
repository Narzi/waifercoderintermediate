import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class treesettest {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Mg Mg");
        names.add("Aung Aung ");
        names.add("Tun Tun");
        names.add("Su Su");
        names.add("Mya Mya");
        names.add("Aye Aye");


        Spliterator spliterator = names.spliterator();
        spliterator.forEachRemaining((n)-> System.out.println(n));
    }
}
