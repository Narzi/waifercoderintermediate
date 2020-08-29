import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mg Mg");
        names.add("Aung Aung");
        names.add("Su Su");
        names.add("Mu Mu");
        names.add("Thu MThu");
        names.add("Ba Hla");


        System.out.println(names.size());
        names.add(2,"Mu MU");
        System.out.println(names.get(3));

    }

}