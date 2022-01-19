class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; //n = 3
        int rotations = (int) Math.floor(n/2); //for n = 3, = 1

        //for loop - for each rotation
        for(int i = 0; i<rotations; i++){

            //outside rotation first
            int[] right = new int[n-2*i];
            int[] bottom = new int[n-2*i];
            int[] left = new int[n-2*i];
            int[] top = new int[n-2*i];


            for(int j = 0; j< right.length; j++){
                //for loop to save each side
                right[j] = matrix[j+i][n-i-1];
                bottom[j] = matrix[n-i-1][n-i-1-j];
                left[j] = matrix[n-i-1-j][i];
                top[j] = matrix[i][j+i];
            }

            for(int j = 0; j< right.length; j++){
                //for loop to set each side
                matrix[j+i][n-i-1] = top[j];
                matrix[n-i-1][n-i-1-j] = right[j];
                matrix[n-i-1-j][i] = bottom[j];
                matrix[i][j+i] = left[j];
            }
        }
    }
}