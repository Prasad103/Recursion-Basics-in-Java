public class Factorial_of_n {
    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String args[]) {
        int n  = 5;
        System.out.println("Factorial of n = " + fact(n));
    }
}
