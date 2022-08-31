boolean solution(String inputString) {
    int[] chars = new int[26];
    for (int i = 0; i < inputString.length(); i++) {
        chars[inputString.charAt(i) - 97]++;
    }
    int odds = 0;
    for (int i = 0; i < chars.length; i++) {
        odds += chars[i] % 2;
    }
    if (odds > 1) {
        return (false);
    }
    return (true);
}
