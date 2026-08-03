class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        char[][] grid = new char[numRows][s.length()];

        int row = 0;
        int col = 0;
        boolean down = true;

        for (char ch : s.toCharArray()) {

            grid[row][col] = ch;

            if (down) {

                if (row == numRows - 1) {
                    down = false;
                    row--;
                    col++;
                } else {
                    row++;
                }

            } else {

                if (row == 0) {
                    down = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {

            for (int j = 0; j < s.length(); j++) {

                if (grid[i][j] != '\0')
                    ans.append(grid[i][j]);
            }
        }

        return ans.toString();
    }
}