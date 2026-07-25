class Solution {
    public int removeDuplicates(int[] nums) {

        int[] temp = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (temp[j] == nums[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k] = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}