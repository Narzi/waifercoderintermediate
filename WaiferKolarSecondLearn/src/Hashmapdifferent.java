import java.util.*;

public class Hashmapdifferent {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        hashMap.put(9,"Nine");
        hashMap.put(3,"Three");
        hashMap.put(1,"One");
        hashMap.put(7,"Seven");
        hashMap.put(5,"Five");
        hashMap.put(2,"Two");

        linkedHashMap.put(9,"Nine");
        linkedHashMap.put(3,"Three");
        linkedHashMap.put(1,"One");
        linkedHashMap.put(7,"Seven");
        linkedHashMap.put(5,"Five");
        linkedHashMap.put(2,"Two");

        treeMap.put(9,"Nine");
        treeMap.put(3,"Three");
        treeMap.put(1,"One");
        treeMap.put(7,"Seven");
        treeMap.put(5,"Five");
        treeMap.put(2,"Two");

        System.out.println("*************** HashMap Out Put ********************");

        for(Map.Entry map:hashMap.entrySet()){
            System.out.println(map.getKey()+ ":" + map.getValue());
        }

        System.out.println("*************** LinkedHashMap Out Put ********************");

        for(Map.Entry map:linkedHashMap.entrySet()){
            System.out.println(map.getKey()+ ":" + map.getValue());
        }

        System.out.println("*************** TreeMap Out Put ********************");

        for(Map.Entry map:treeMap.entrySet()){
            System.out.println(map.getKey()+ ":" + map.getValue());
        }




    }
}
