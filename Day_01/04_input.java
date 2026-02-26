import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for integer input
        System.out.println("Enter a Number : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("You Entered : " +num);

        //for string input
        System.out.println("Enter a String : " );
        String str = sc.nextLine();
        System.out.println("You Entered : " +str);

        //for double input
        System.out.println("Enter a Double : ");
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("You Entered : " +d);
        //sentence input
        System.out.println("Enter a Sentence : ");
        String sentence = sc.nextLine();
        System.out.println("You Entered : " +sentence);

        sc.close();
    }
}
