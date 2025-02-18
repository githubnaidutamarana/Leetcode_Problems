class Solution {
    public char findTheDifference(String s, String t) {
        int ssum = 0;
        int tsum =0;
        for(int i=0;i<s.length();i++)
        {
            ssum = ssum + (int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            tsum = tsum + (int)t.charAt(i);
        }
        int value = tsum - ssum;
        return (char)value;    
    }
}