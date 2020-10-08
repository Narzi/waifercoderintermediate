import java.util.TreeMap;

public class treemaptest {
    public static void main(String[] args) {
        TreeMap<String , String> tmap =  new TreeMap<>();
        tmap.put("Zero","Mg Mg ");
        tmap.put("One","Aung Aung ");
        tmap.put("Two","Tun Tun ");
        tmap.put("Three","Su Su ");
        tmap.put("Four","Mya Mya ");
        tmap.put("Five","Mu Mu ");
        System.out.println(tmap.values());

    }
}
