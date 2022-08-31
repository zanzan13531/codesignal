int solution(int[][] matrix) {
    int total = 0;
    Set<Integer> zeros = new HashSet<Integer>();
    for (int j = 0; j < matrix[0].length; j++) { //first row is free
        total += matrix[0][j];
        if (matrix[0][j] == 0) {
            zeros.add(j);
        }
    }
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (!(zeros.contains(j))) {
                total += matrix[i][j];
            }
            if (matrix[i][j] == 0) {
                zeros.add(j);
            }
        }
    }
    return (total);
    
}
