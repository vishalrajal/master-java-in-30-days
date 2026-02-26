// Problem: Demonstrate all types of loops in Java
// Day: 01
// Phase: Java Foundations
// Concepts: for loop, while loop, do-while loop
// Time Complexity: O(n)
// Space Complexity: O(1)

class Loops {
    public static void main(String[] args) {
        //For Loop 
        int n = 5;
        System.out.println("\n For Loop:");
        for(int i=1; i<=n; i++) {
            System.out.println("For loop i = " +i);
            i++;
        }
        //While Loop
        System.out.println("/n While Loop");
        int j = 1;
        while(j<n) {
            System.out.println("While Loop j = " +j);
            j++;
        }
        //Do-While Loop
        System.out.println("Do-While Loop");
        int k = 1;
        do {
            System.out.println("Do-While Loop k = " +k);
            k++;
        }while(k<=n);

    }
}
