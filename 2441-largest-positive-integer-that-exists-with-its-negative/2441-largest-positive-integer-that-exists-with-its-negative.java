import java.util.HashSet;

class Solution {

    public int findMaxK(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int ans = -1;

        for (int num : nums) {

            if (set.contains(-num)) {

                ans = Math.max(ans, Math.abs(num));
            }
        }

        return ans;
    }
}