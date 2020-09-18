import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public class EnumTest {
    public static void main(String[] args) {
//      EnumSet<Days> set= EnumSet.of(Days.SAT,Days.SUNDAY);
//      Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        EnumMap<Days,String> names = new EnumMap<Days,String>(Days.class);
        names.put(Days.SUNDAY,"Mg Mg");
        names.put(Days.MONDAY,"Aung Aung ");
        names.put(Days.TUE,"Mg Mg");
        names.put(Days.WED,"Mg Mg");
        names.put(Days.THUS,"Mg Mg");
        names.put(Days.FRI,"Mg Mg");
        names.put(Days.SAT,"Mg Mg");

        System.out.println(names.size());


        for(Map.Entry map : names.entrySet()){
            System.out.println(map.getKey());
        }


    }
}
