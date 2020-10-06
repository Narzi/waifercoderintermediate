import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistVslinkedlist {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        LinkedList<String> liknedList= new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> liknedList= new LinkedList<>();

        ArraylistVslinkedlist m = new ArraylistVslinkedlist();

        m.doWork(arrayList,"ArrayList");
        m.doWork(liknedList,"Linked List");

    }
//    public void doWork(List<String> list, String name){
//        long start = System.currentTimeMillis();
//
//        for(int i =0;i<1E5;i++){
//            list.add("Now I is " + i );
//        }
//
//
//        long end = System.currentTimeMillis();
//        System.out.println("Its Takes" + (end - start) + "For" + name);
//    }

    public void doWork(List<Integer> list, String name){
        long start = System.currentTimeMillis();

        for(int i =0;i<1E5;i++){
            list.add( i );
        }


        long end = System.currentTimeMillis();
        System.out.println("Its Takes" + (end - start) + "For" + name);
    }
}
