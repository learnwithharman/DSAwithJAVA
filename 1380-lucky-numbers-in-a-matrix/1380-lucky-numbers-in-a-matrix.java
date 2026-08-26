class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean lucky=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][col]>min){
                    lucky=false;
                    break;
                }
            }
            if(lucky){
                ans.add(min);
            }

        }
        return ans;
        
    }
}


// class Solution {
//     public List<Integer> luckyNumbers(int[][] matrix) {
//         List<Integer> ans = new ArrayList<>();
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 int num = matrix[i][j];
//                 // Check: is num minimum in its row?
//                 boolean rowMin = true;

//                 for (int k = 0; k < matrix[0].length; k++) {
//                     if (matrix[i][k] < num) {
//                         rowMin = false;
//                         break;
//                     }
//                 }
//                 boolean colMax = true;
//                 for (int k = 0; k < matrix.length; k++) {
//                     if (matrix[k][j] > num) {
//                         colMax = false;
//                         break;
//                     }
//                 }
//                 if (rowMin && colMax) {
//                     ans.add(num);
//                 }
//             }
//         }
//         return ans;
//     }
// }