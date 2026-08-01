class Solution {
    public int lengthOfLongestSubstring(String s) {
        int charIndex[] = new int[128];

        int maxLength=0, left=0;
        
        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            left = Math.max(left, charIndex[ch]);

            charIndex[ch] = right + 1;

            maxLength = Math.max(maxLength,right - left + 1); 
        }

        return maxLength;
    }
}






//  MY APPROACH 

// import java.util.HashMap;

// class Solution {

//     public int lengthOfLongestSubstring(String s) {

//         HashMap<Character, Integer> map = new HashMap<>();

//         int left = 0;
//         int max = 0;

//         for (int right = 0; right < s.length(); right++) {

//             char ch = s.charAt(right);

//             if (map.containsKey(ch)) {
//                 left = Math.max(left, map.get(ch) + 1);
//             }

//             map.put(ch, right);

//             max = Math.max(max, right - left + 1);
//         }

//         return max;
//     }
// }