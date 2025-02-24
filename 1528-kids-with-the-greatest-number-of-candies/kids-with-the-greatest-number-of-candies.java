class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maximum = 0;
        for (int candy : candies) {
            maximum = Math.max(maximum, candy);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maximum) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;

         
    }
}