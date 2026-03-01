// Problem: Working with jagged arrays in java
// Day: 03
// Phase: Java Foundations
// Concepts: arrays, loops, jagged arrays

class Jagged { 
    public static void main(String args[]) {
        int nums[][] = new int[4][];
        nums[0] = new int[1];
        nums[1] = new int[2];
        nums[2] = new int[3];
        nums[3] = new int[4];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                nums[i][j] = j+1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}