int[][] solution(int[][] image) {
    int[][] result = new int[image.length - 2][image[0].length - 2];
    for (int i = 1; i < image.length - 1; i++) {
        for (int j = 1; j < image[0].length - 1; j++) {
            int sum =   image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] + 
                        image[i][j-1] + image[i][j] + image[i][j+1] +
                        image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];
            result[i-1][j-1] = sum / 9;
        }
    }
    return (result);
}
