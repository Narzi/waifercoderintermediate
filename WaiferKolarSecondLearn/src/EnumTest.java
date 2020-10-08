import java.util.*;

public class EnumTest {
    public static void main(String[] args) {
//        Set<Days> set  = EnumSet.of(Days.SATURDAY,Days.SUNDAY);
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        EnumMap<Days,String> names = new EnumMap<Days,String>(Days.class);
        names.put(Days.SUNDAY,"Mg Mg");
        names.put(Days.MONDAY,"Aung Aung ");
        names.put(Days.TUESDAY,"Su Su");
        names.put(Days.WENESDAY,"Tun Tun");
        names.put(Days.THUSDAY,"Soe Soe");
        names.put(Days.FRIDAY,"Mu Mu ");

        for(Map.Entry map: names.entrySet()){
            System.out.println("Key is " + map.getKey()+"Value is" + map.getValue());
        }


    }

}
