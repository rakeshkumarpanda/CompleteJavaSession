package arrays;

public class InitRetrieveValue {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
//        System.out.println(nums[4]);//default value is 0
        nums[4]=50;

        //Getting up the values
        //1st approach - using for loop
//        for (int i=0; i<nums.length; i++)
//            System.out.println(nums[i]);
        //2nd approach - using advanced for loop or for-each loop
//        for (int x : nums)
//            System.out.println(x);

        String[] animals = {"Tiger", "Elephant", "Lion", "Bear"};
//        for (String x: animals) //---->O(n)
//            System.out.println(x);
        System.out.println(animals[2]);// O(1)

    }
}
