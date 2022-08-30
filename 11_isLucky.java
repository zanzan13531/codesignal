boolean solution(int n) {
    String given = "" + n;
    int firstHalf = 0;
    int secondHalf = 0;
    for (int i = 0; i < given.length() / 2; i++) {
        firstHalf += Integer.parseInt(given.substring(i, i + 1));
        secondHalf += Integer.parseInt(given.substring(given.length() - i - 1, given.length() - i));
    }
    return (firstHalf == secondHalf);
}
