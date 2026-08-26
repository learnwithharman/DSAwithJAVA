class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                // Check: is num minimum in its row?
                boolean rowMin = true;

                for (int k = 0; k < matrix[0].length; k++) {
                    if (matrix[i][k] < num) {
                        rowMin = false;
                        break;
                    }
                }
                boolean colMax = true;
                for (int k = 0; k < matrix.length; k++) {
                    if (matrix[k][j] > num) {
                        colMax = false;
                        break;
                    }
                }
                if (rowMin && colMax) {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}