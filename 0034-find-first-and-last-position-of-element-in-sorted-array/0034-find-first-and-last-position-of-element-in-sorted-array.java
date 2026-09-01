class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // First occurrence
    static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;       // aur left jao
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    // Last occurrence
    static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;     // aur right jao
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}


// class Solution {
//     public int[] searchRange(int[] nums, int target) {

//         int [] ans ={-1,-1};


//         // check for first occurence if target first
//         int start = search(nums, target,true);
//         int end = search(nums, target,false);
//         ans[0] = start;
//         ans[1]= end; 
//         return ans;
        
//     }

//     // this function just returns the index value of target
//     int search(int[] nums,int target, boolean findStartIndex){
//         int ans =-1;
//         int start =0;
//         int end = nums.length-1;

//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(target<nums[mid]){
//                 end =mid-1;
//             }else if (target>nums[mid]){
//                 start=mid+1;
//             }else{
//                 ans = mid;
//                 if(findStartIndex){
//                     end=mid-1;
//                 }else{
//                     start =mid+1;
//                 }
//             }
//         }
//         return ans;

//     }
// }