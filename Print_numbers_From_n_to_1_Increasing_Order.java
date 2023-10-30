//Print numbers from n to 1(Increasing Order)

public class  Print_numbers_From_n_to_1_Increasing_Order {
    public static void printInc(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String args[]) {
    printInc(5);
    }
}
