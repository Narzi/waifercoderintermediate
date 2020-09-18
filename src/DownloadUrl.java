import java.util.Iterator;
import java.util.LinkedList;

public class DownloadUrl implements Iterable<String> {
    LinkedList<String> list = new LinkedList<>();


    public DownloadUrl(){
        list.add("https://www.google.com/");
        list.add("https://www.youtube.com/");
        list.add("https://www.pinterest.com/");

    }


    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }



}