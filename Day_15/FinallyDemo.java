public class FinallyDemo {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.print(a);
        }

        catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }

        finally {
            System.out.println("Finally block executed");
        }

    }
}
//Note : Finally always executes on both cases of exception and no exceptions.
