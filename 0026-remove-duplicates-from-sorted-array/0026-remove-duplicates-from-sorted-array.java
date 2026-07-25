class Solution {
    public int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];
        int k = 1;

        temp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                temp[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }
}