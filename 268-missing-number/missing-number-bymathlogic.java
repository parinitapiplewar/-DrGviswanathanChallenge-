class Solution {
    public static int missingNumber(int[] nums) {
     int n = nums.length;
    int expectedsum=(n*(n+1))/2 ;
     int actualsum=0;
     for (int num:nums)
     {
        actualsum+=num;
    
     }
     return expectedsum-actualsum ;
    }
    public static void main(String[]args)
    {
        int[]nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}
