public class Sum_of_First_N_NaturalNumbers {
    public static int calcsum(int n) {
        if(n==1) {
            return 1;
        }
        int Snm1 = calcsum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(calcsum(n));
    }
}
