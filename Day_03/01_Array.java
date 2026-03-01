// Problem: Demonstrate arrays in Java
// Day: 03
// Phase: Java Foundations
// Concepts: arrays. loops
import java.util.Scanner;
class ArrayDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Array Created for size: " + size);
        System.out.println("Enter the array elements : ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array elements are : ");
        for(int num : nums) {
            System.out.print(nums[num] + " ");
        }

    }
}