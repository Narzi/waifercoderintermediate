public class Factorial {
    static int factorial(int n ){
        if(n==1){
            return 1;
        }

        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int fac = factorial(5);
        System.out.println("5!" + fac);
    }
}
