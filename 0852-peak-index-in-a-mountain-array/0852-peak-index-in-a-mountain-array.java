class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // We are on increasing side
                start = mid + 1;
            } 
            else {
                // We are on decreasing side
                end = mid;
            }
        }
        return start;
    }
}