class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

// class Solution {
//     public int maxArea(int[] height) {
//         int n=height.length;
//         int i=0;
//         int j=n-1;
//         int w=0;
//         int h=0;
//         int ans=Integer.MIN_VALUE;
//         int curr=0;
//         while(i<j)
//         {
//             w=j-i;
//             h=Math.min(height[i],height[j]);
//             curr=w*h;
//             ans=Math.max(curr,ans);
//             if(height[i]<=height[j])
//             {
//                 i++;
//             }
//             else
//             j--;
//         }
//         return ans;
//     }
// }