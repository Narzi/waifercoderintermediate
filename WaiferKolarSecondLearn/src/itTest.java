import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class itTest {
    public static void main(String[] args) {
        String [] dishes = new String[]{"prok","Chicken","Beef","Fish","Watercress"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(dishes));
        System.out.println("+++++ Iterator Loop +++++++");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("++++++++ Reverse Iterat");


        System.out.println("++++++++++For Each Java 5 and above ++++++++++");

        for(String value:list){
            System.out.println(value + "Curry");
        }
    }
}
