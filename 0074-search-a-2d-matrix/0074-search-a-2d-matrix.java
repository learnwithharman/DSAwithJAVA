class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 1D index ko 2D index mein convert
            int row = mid / cols; // rows bhi use kr skte h i.e.    int row = mid / rows;
            int col = mid % cols;                               //  int col = mid % rows;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}