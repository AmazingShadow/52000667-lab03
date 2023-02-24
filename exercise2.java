public class exercise2 {

    public static int[][] exercise2A(int[][] arrOne, int[][] arrTwo) {
        int row = arrOne.length;
        int col = arrTwo[0].length;
        int[][] result = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = arrOne[i][j] + arrTwo[i][j];
            }
        }

        return result;
    } 

    public static int[][] exercise2B(int[][] arrOne, int[][] arrTwo) {
        int row = arrOne.length;
        int col = arrTwo[0].length;
        int[][] result = new int[row][col];
        int sum;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = 0;
                for (int k = 0; k < arrOne[0].length; k++) {
                    sum += arrOne[i][k] * arrTwo[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    } 

    public static void printMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
    }

    public static void main(String[] args) {
        int[][] arrOne = {{1, 2}, {1, 2}};
        int[][] arrTwo = {{1, 2}, {1, 2}};
        printMatrix(exercise2A(arrOne, arrTwo));
        printMatrix(exercise2B(arrOne, arrTwo));
        printMatrix(arrOne);
    }
}