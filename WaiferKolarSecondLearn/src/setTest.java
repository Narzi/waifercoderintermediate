import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashSet.add("One");
        hashSet.add("Six");
        hashSet.add("Two");
        hashSet.add("Eight");
        hashSet.add("Twenty");
        hashSet.add("Forty");

        linkedHashSet.add("One");
        linkedHashSet.add("Six");
        linkedHashSet.add("Two");
        linkedHashSet.add("Eight");
        linkedHashSet.add("Twenty");
        linkedHashSet.add("Forty");

        treeSet.add("One");
        treeSet.add("Six");
        treeSet.add("Two");
        treeSet.add("Eight");
        treeSet.add("Twenty");
        treeSet.add("Forty");

        System.out.println("******************** Hash Set *********************");
        for(String value : hashSet){
            System.out.println(value);
        }

        System.out.println("******************** Linked HashSet *********************");
        for(String value : linkedHashSet){
            System.out.println(value);
        }

        System.out.println("******************** Tree Set *********************");
        for(String value : treeSet){
            System.out.println(value);
        }


        









    }
}
