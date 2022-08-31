boolean solution(String inputString) {
    int lengthy = inputString.length();
    for (int i = 0; i < lengthy / 2 + 1; i++) {
        if (inputString.charAt(i) != inputString.charAt(lengthy - 1 - i)) {
            return (false);
        }
    }
    return (true);
}
