class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            // Step 1: Reverse the row
            int start =0;
            int end = image[i].length-1;
            while(start<=end){
                int temp= image[i][start];
                image[i][start]=1-image[i][end];
                image[i][end]=1-temp;
                start++;
                end--;
            }

        }
        return image;
    }
}