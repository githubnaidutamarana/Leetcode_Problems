class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;

         
    }
}