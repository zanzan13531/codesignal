boolean solution(String inputString) {
    String[] input = inputString.split("\\.");
    if (input.length != 4) {
        return (false);
    }
    for (int i = 0; i < 4; i++) {
        if (!(input[i].matches("\\d+")) || (input[i].length() > 3)) {
            return (false);
        }
        if ((input[i].length() > 1) && input[i].charAt(0) == '0') {
            return (false);
        }
        if (Integer.parseInt(input[i]) > 255) {
            return (false);
        }
    }
    return (true);
}
