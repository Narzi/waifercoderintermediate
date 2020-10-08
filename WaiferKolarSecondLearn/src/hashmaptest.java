import java.util.HashMap;
import java.util.Map;

public class hashmaptest {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Mg Mg");
        names.put(2,"Aung Aung");
        names.put(3,"Tun Tun");
        names.put(4,"Su Su ");
        names.put(5,"Mya Mya");
        names.put(6,"Mu Mu");
//        System.out.println(names.size());

//        System.out.println(names.get(1));

        HashMap<Integer,String> banes = (HashMap<Integer, String>) names.clone();
//
//        for(Map.Entry<Integer,String>  map: names.entrySet()){
//             System.out.println("Key is  " + map.getKey() + " and Value is  " + map.getValue() );
//        }

          for(int key:names.keySet()){
              System.out.println("Key is " + key + "Value is"  + names.get(key));
          }

    }
}