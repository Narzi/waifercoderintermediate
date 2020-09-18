import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class AryandLink {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        AryandLink m = new AryandLink();

        m.doWork(arrayList,"ArrayList");
        m.doWork(linkedList,"LinkedList");
    }

    public void doWork(List<Integer> list , String name ){
        long Start = System.currentTimeMillis();


        for (int i = 0;i<1E5;i++){
            list.add(i);
        }

        for(int i = 0; i < 1E5;i++){
            list.add(0,i);
        }

        long end  = System.currentTimeMillis();

        System.out.println("It takes " + (end - Start) +"For" + name);

    }
}
