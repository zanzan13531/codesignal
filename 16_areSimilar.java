boolean solution(int[] a, int[] b) {
    int differences = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            differences++;
            if (differences > 2) {
                return (false);
            }
        }
    }
    Arrays.sort(a);
    Arrays.sort(b);
    
    return (Arrays.equals(a, b));

}