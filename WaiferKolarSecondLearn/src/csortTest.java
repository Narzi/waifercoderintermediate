import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "ID   : " + id + "Name : " + name;
    }
}





public class csortTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(98,"Mg Mg"));
        list.add(new Student(23,"Toe Toe"));
        list.add(new Student(14,"Aung Aung"));
        list.add(new Student(86,"Htay Htay"));
        list.add(new Student(77,"Bo Htay Bo Htay "));

        Collections.sort(list, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                }else if(o1.getId() < o2.getId()){
                    return -1;
                }

                return 0;
            }
        });

        for(Student student:list){
            System.out.println(student.getId() + " : " + student.getName());
        }
        System.out.println("++++++++++++++ Sort By Name +++++++++++");

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        for(Student student:list){
            System.out.println(student.getId() + " : " + student.getName());
        }

        System.out.println("++++++++++++++ Sort By String Length  +++++++++++");

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().length() > o2.getName().length()){
                    return 1;
                }else if(o1.getName().length()<o2.getName().length()){
                    return -1;
                }

                return 0;
            }
        });


        for(Student student:list){
            System.out.println(student.getId() + " : " + student.getName());
        }

    }
}
