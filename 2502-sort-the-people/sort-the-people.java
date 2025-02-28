class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0 ; i < names.length;i++){
            for(int j=1;j<names.length;j++){
                if(heights[j-1]<heights[j]){
                    String name = names[j-1];
                    names[j-1]=names[j];
                    names[j]=name;
                    int height  = heights[j-1];
                    heights[j-1]=heights[j];
                    heights[j]=height;
                }
            }
        }
        return names;
    }
}