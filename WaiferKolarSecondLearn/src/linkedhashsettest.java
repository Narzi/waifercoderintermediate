import java.util.LinkedHashSet;
import java.util.Spliterator;

public class linkedhashsettest {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Mg Mg");
        names.add("Aung Aung ");
        names.add("Tun Tun");
        names.add("Su Su");
        names.add("Mya Mya");
        names.add("Aye Aye");


        Spliterator spliter = names.spliterator();
        final int[] i = {1};
        while(spliter.tryAdvance((n)-> System.out.println(i[0]++ + "" + n)));

    }
}
