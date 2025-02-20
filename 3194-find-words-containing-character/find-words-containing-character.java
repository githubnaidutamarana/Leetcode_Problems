// class Solution {
//     public List<Integer> findWordsContaining(String[] words, char x) {
        
//         List<Integer> list = new ArrayList<>();
//          boolean isPresent = false;
//         for(String word : words){
           
//             for(int i=0;i<word.length();i++){
//                 char ch = word.charAt(i);
//                 if(ch == x){
//                     isPresent=true;
//                 }
//             }
            
//         }
//         if(isPresent){
//                 return list;
//         }
//     }
// }
import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) { 
                list.add(i);
            }
        }
        return list;
    }
}
