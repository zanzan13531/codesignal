int solution(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result += ((i - 1) * 4);
    }
    return (result);
}
