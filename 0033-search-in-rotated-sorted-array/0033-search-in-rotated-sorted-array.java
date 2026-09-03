class Solution {
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array already sorted
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Target pivot itself hai
        if (nums[pivot] == target) {
            return pivot;
        }

        // Target left sorted part mein ho sakta hai
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Target right sorted part mein hoga
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}