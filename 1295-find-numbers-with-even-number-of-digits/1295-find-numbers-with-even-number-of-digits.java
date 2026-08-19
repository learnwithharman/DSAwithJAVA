// optimized/math approach

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int n = nums[i];
            int digits=0;
            while (n>0) {
                digits++;
                n=n/10;
            }
            if (digits % 2==0){
                count++;

            }    
        }
        return count;
    }
}


// Brute Force hai number ko String bana 

// class Solution {
//     public int findNumbers(int[] nums) {

//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {

//             String str = String.valueOf(nums[i]);

//             if (str.length() % 2 == 0) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }