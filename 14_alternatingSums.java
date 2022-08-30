int[] solution(int[] a) {
    int[] weights = new int[2];
    for (int i = 0; i < a.length; i++) {
        if (i % 2 == 0) {
            weights[0] += a[i];
        } else {
            weights[1] += a[i];
        }
    }
    return (weights);
}
