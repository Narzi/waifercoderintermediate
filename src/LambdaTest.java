interface ClickEmitter{
    void click();
}

 class Job{
        public void work(ClickEmitter e){

            e.click();

        }
}

public class LambdaTest {
    public static void main(String[] args) {

        Job job =  new Job();
//        job.work(new ClickEmitter() {
//            @Override
//            public void click() {
//                System.out.println("I am being clicked");
//            }
//        });
        //before use lambda expression

        job.work(()-> System.out.println("I am new style"));
}
}

