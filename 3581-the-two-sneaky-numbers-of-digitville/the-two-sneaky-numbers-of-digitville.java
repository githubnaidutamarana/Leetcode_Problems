class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> h = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(Integer i : nums){
             if(!h.add(i)){
                duplicates.add(i);
             }
        }
        int[] result = new int[duplicates.size()];
        int i = 0;
        for (int num : duplicates) {
            result[i++] = num;
        }
        return result;
    }
}