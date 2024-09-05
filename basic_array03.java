public class basic_array03 {
    public static void main(String[] args) {
        final int row = 3, column = 4;
        int score[][] = new int[row][column];
        int data = 5;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                score[i][j] = data;
                data += 1;
                System.out.print("\t" + score[i][j]);
            }
            System.out.println();
        }
    }
}
