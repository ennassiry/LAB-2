public class Ex {

    public static int[][] SpiraleMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        
        while (num <= n * n) {
            for (int col = left; col <= right ; col++) {
                matrix[top][col] = num++;
            }
            top++; 

            for (int row = top; row <= bottom ; row++) {
                matrix[row][right] = num++;
            }
            right--; 

           
            for (int col = right; col >= left ; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--; 

            
            for (int row = bottom; row >= top ; row--) {
                matrix[row][left] = num++;
            }
            left++; 
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = SpiraleMatrix(n);

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}