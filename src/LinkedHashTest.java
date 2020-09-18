import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashTest {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Mg Mg ");
        names.add(" Aung Aung ");
        names.add(" Tun Tun");
        names.add(" Su SU");
        names.add("Mya Mya ");
        names.add("Aye AYe");

        System.out.println(names.size());

        Spliterator spliterator = names.spliterator();
        for(String name:names){
            System.out.println(name);
        }
    }
}
