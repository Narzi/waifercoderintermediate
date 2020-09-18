import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        //First Chapter
//        LinkedList<String> names = new LinkedList<>();
//        names.add("Mg Mg");
//        names.add("Aung Aung");
//        names.add("Su Su");
//        names.add("Mu Mu");
//        names.add("Thu MThu");
//        names.add("Ba Hla");
//
//
//        System.out.println(names.size());
//        names.add(2,"Mu MU");
//        System.out.println(names.get(3));


        //Second Chapter

        LinkedList<String> names = new LinkedList<>();
        names.add("Mg Mg");
        names.add("Aung Aung");
        names.add("Su Su");
        names.add("Mu Mu");
        names.add("Thu MThu");
        names.add("Ba Hla");

        String [] nameAry = new String[names.size()];
        nameAry = names.toArray(nameAry);
        System.out.println(Arrays.toString(nameAry));

        LinkedList<String> banes = new LinkedList<>();
        banes.add("Thura");
        banes.add("Su MOn");
        banes.addAll(names);

        String [] baneAray = new String[banes.size()];
        baneAray = banes.toArray(baneAray);
        System.out.println(Arrays.toString(baneAray));


    }

}