class Solution {
    public int[] shuffle(int[] nums, int n) {
         
        int[] result = new int[nums.length];
       
        int start=0;
        int index=0;
        int mid=n;

        while(mid<nums.length){
            result[index++] = nums[start++];
            result[index++] = nums[mid++];
        }
       return result;
    }
}