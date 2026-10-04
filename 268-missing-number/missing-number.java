class Solution {
    public static int missingNumber(int[] nums) {
     int n = nums.length;
    
     int allXOR=0;
     for(int i=0;i<=n;i++){
        allXOR=allXOR^i;
     }
     for (int num:nums)
     {
        allXOR=allXOR^num;
    
     }
     return allXOR ;
    }
    public static void main(String[]args)
    {
        int[]nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}