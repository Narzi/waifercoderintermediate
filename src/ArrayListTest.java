import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // Ch1
//       ArrayList<String> names =  new ArrayList<>();
//       names.add("I am array list "); // index number 0
//       names.add("I am 2");//index number 1
//       names.add("I am 3"); // index number 2
//       names.add("I am 4");// index number
//        names.add(2,"Nu Nu");// index number ko a tay pay nyees
//
//
//        System.out.println(names.get(2));

        //Ch2
        ArrayList<String> names =  new ArrayList<>();
        names.add("I am array list "); // index number 0
        names.add("I am 2");//index number 1
        names.add("I am 3"); // index number 2
        names.add("I am 4");// index number
        names.add(2,"Nu Nu");// index number ko a tay pay nyees


//        ArrayList<String> students = new ArrayList<>(names);
//        System.out.println(students.size());


//        for (String name:names){
//            System.out.println(name);
//        }

//        System.out.println(names.size());

        System.out.println("Before adding drver");
        new ArrayListTest().outPut(names);


        ArrayList<String> drivers = new ArrayList<>();
        drivers.add("U Mya");
        drivers.add("U Htay");

        names.addAll(drivers);

//        System.out.println(names.size());

        System.out.println("*****************After************");
        new ArrayListTest().outPut(names);
    }
        public void outPut(ArrayList<String>list){
                for(String name:list ){
                    System.out.println(name);
                }
        }
}
