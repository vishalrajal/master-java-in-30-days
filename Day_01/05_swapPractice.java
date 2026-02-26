import java.util.Scanner;
class Practice01 {
    //swapping a and b without 3rd var
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Before Swapping : a = " +a + " b = " +b);
        a = a ^ b;
        b = a ^ b;
        a = a^b;
        System.out.println("After Swapping : a = " +a + " b = " +b);

        //swapping variables by user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter Value of y : ");
        int y = sc.nextInt();
        System.out.println("Before Swapping : x = " +x+ " y = " +y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swapping : x = " +x+ " y = " +y);
        sc.close();


    }
}
