class Solution {
    public int maximumProduct(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minindex]){
                    minindex=j;
                }

            }
            int tmp = nums[i];
            nums[i]=nums[minindex];
            nums[minindex]=tmp;
        }
        int n= nums.length;
        int product1= nums[n-1]*nums[n-2]*nums[n-3];
        int product2=nums[0]*nums[1]*nums[n-1];
        return Math.max(product1,product2);
    }

}