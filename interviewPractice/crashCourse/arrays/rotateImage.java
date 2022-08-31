// doing this one in place was pretty hard, I really should have written it down on a paper to make it easier
int[][] solution(int[][] a) {
    int s = a.length;
    for (int i = s/2; i >= 0; i--) {
        if (s % 2 == 1 || !(i == s/2)) {
            int temp = a[i][i]; // corner cases
            a[i][i] = a[s-i-1][i];
            a[s-i-1][i] = a[s-i-1][s-i-1];
            a[s-i-1][s-i-1] = a[i][s-i-1];
            a[i][s-i-1] = temp;
        }
        for (int j = i + 1; j < s - i - 1; j++) { // side cases
            int temp = a[i][j];
            a[i][j] = a[s-j-1][i];
            a[s-j-1][i] = a[s-i-1][s-j-1];
            a[s-i-1][s-j-1] = a[j][s-i-1];
            a[j][s-i-1] = temp;
        }
    }
    return (a);
}
