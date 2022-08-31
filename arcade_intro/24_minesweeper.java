int[][] solution(boolean[][] matrix) {
    
    int x = matrix.length;
    int y = matrix[0].length;
    
    int[][] board = new int[x][y];
    
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            int mines = 0;
            if (i > 0) {
                if (j > 0 && matrix[i-1][j-1]) {
                    mines++;
                }
                if (matrix[i-1][j]) {
                    mines++;
                }
                if (j < y - 1 && matrix[i-1][j+1]) {
                    mines++;
                }
            }
            if (j > 0 && matrix[i][j-1]) {
                mines++;
            }
            if (j < y - 1 && matrix[i][j+1]) {
                 mines++;
            }
            if (i < x - 1) {
                if (j > 0 && matrix[i+1][j-1]) {
                    mines++;
                }
                if (matrix[i+1][j]) {
                    mines++;
                }
                if (j < y - 1 && matrix[i+1][j+1]) {
                    mines++;
                }
            }
            board[i][j] = mines;
        }
    }
    return (board);
}
