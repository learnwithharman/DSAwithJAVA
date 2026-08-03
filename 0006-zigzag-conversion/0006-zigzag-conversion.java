// class Solution {
//     public String convert(String s, int numRows) {
//         int length = s.length();
//         char[] chars = new char[length];
//         if (numRows == 1 || numRows > length) return s;
//         int step = 2*numRows-2, charN = 0, cnt, d;
//         for (int row = 0; row < numRows; row++) {
//             cnt = row;
//             do  {
//                 chars[charN++] = s.charAt(cnt);
//                 if (row != 0 && row != numRows-1 && (d = cnt + step - 2*row) < length) chars[charN++] = s.charAt(d);
                
//             } while ((cnt+=step) < length);
//         }
//         return new String(chars);
//     }
// }
//         // for (int row = 0; row < numRows; row++) {
//         //     for (int i = 0; i < s.length(); i++) {
//         //         if (i%(a+b) >= numRows) {
//         //             if ((a+b)-(i%(a+b)) == row)
//         //                 chars[charN++] = s.charAt(i);
//         //         }
//         //         else {
//         //             if (i%(a+b) == row)
//         //                 chars[charN++] = s.charAt(i);
//         //         }
//         //         if (charN == s.length()) return new String(chars);
//         //     }
//         //     a-=2; b+=2;
//         // }
        


//         //n = numRows
//         //n = 2
//         //1st row: 0, 2  4, 6  8, 10  11, (n+1)       2, 0    a+b
//         //2nd row: 1, 3, 5, 7, 9,  8, 12, (n-1, n)    0, 2    a, b=2 
//         //n = 3 (3, 5, 3)
//         //1st row: 0,    4,    8, (n+1)             4
//         //2nd row: 1, 3, 5, 7, 9, (n-1)             2
//         //3rd row: 2,    6    10, (n+1)             4
//         //n = 4 (2, 3, 4, 2)
//         //1st row: 0,       6,         12, (n+2)    6, 0                   0
//         //2nd row: 1,    5, 7,     11, 13, (n, n-2) 4, 2                1
//         //3rd row: 2, 4,    8, 10,     14, (n-2, n) 2, 4                2
//         //4th row: 3,       9,         15, (n+2)    0, 6                   3
//         //n = 5     (2, 3, 3, 2, 1)
//         //1st row: 0,          8,             16,   (n+3)       8,      0
//         //2nd row: 1,       7, 9,         15, 17    (n+1, n-3)  6, 2    1
//         //3rd row: 2,    6,   10,     14,     18,   (n-1)       4       2
//         //4th row: 3, 5,      11, 13,         19,   (n-3, n+1)  2, 6    3
//         //5th row: 4,         12,             20,   (n+3)       8       4
//         // 0               12  12 0    14 0
//         // 1            11 13  10 2    12 2
//         // 2         10    14   8 4    10 4
//         // 3       9       15   6 6     8 6
//         // 4     8         16   4 8     6 8
//         // 5  7            17   2 10    4 10
//         // 6               18  12 0     2 12
//         //                               0 14
class Solution {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (numRows == 1 || numRows >= length) return s;

        // Оптимизация 1: Работаем напрямую с массивом исходных символов
        char[] src = s.toCharArray();
        char[] chars = new char[length];
        
        int step = 2 * numRows - 2;
        int charN = 0;

        for (int row = 0; row < numRows; row++) {
            int cnt = row;
            
            // Оптимизация 2: Для первой и последней строки диагонали вообще не нужны
            // Разделение логики убирает лишние if-проверки внутри тяжелого цикла
            if (row == 0 || row == numRows - 1) {
                while (cnt < length) {
                    chars[charN++] = src[cnt];
                    cnt += step;
                }
            } else {
                // Внутренние строки с диагоналями
                int step2 = step - 2 * row;
                while (cnt < length) {
                    chars[charN++] = src[cnt];
                    int d = cnt + step2;
                    if (d < length) {
                        chars[charN++] = src[d];
                    }
                    cnt += step;
                }
            }
        }
        return new String(chars);
    }
}