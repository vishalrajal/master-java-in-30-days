// Problem: Demonstrate String manipulation in Java
// Day: 04
// Phase: Java Foundations
// Concepts: String creation, reversal, charAt

class ReverseDemo {
    public static void main(String args[]) {
        String name = new String("Vishal");
        String reverse = "";
        for(int i = 0; i < name.length(); i++) {
            reverse =  name.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}