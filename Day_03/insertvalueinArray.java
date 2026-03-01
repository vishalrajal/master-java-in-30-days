class ArrayDemo {
    public static void main(String args[]) {

        int nums[] = {10, 20, 30, 40, 50};
        int newNum = 25;
        int index = 2;

        System.out.println("Original Array:");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        int newArr[] = new int[nums.length + 1] ;

        System.out.println("\nArray after inserting new value:");

        for(int i = 0, j = 0; i < newArr.length; i++) {

            if(i == index) {
                newArr[i] = newNum;
            }
            else {
                newArr[i] = nums[j];
                j++;
            }

            System.out.print(newArr[i] + " ");
        }
    }
}