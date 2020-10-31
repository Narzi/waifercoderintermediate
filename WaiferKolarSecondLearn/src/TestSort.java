import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//class StringLengthCompare implements Comparator<String> {
//
//
//   public int compare(String o1, String o2) {
//        if (o1.length() > o2.length()) {
//            return 1;  // kyi yin 1
//        } else if (o1.length() < o2.length()) {
//            return -1;  // small yin -1
//        }
//        return 0;
//    }
//}


class AlphbaticalSort implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

public class TestSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mg Mg");
        list.add("Toe Toe");
        list.add("Aung Aung ");
        list.add("Htay Htay");
        list.add("BoHtay BoHtay");

//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println("Before Sorting");
//        System.out.println(list);
//        System.out.println("Alphabatical sort");
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println("Sort By String Length");
//        Collections.sort(list,new StringLengthCompare());
//        System.out.println(list);

        Collections.sort(list,new AlphbaticalSort()); // alphapaticle a tim si pay tal
        System.out.println(list); //

        


    }
}
