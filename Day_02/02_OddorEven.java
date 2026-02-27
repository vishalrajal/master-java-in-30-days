//Odd Or Even 
import java.util.Scanner;
class practice {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        boolean res = isodd(num);
        if(res) {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
    public static boolean isodd(int n) {
        return n % 2 == 0;
    }
}