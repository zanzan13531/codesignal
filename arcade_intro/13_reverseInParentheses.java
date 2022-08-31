// needed to see a solution to solve this
String solution(String inputString) {
    int start = 0;
    int end = 0;
    for (int i = 0; i < inputString.length(); i++) {
        if (inputString.charAt(i) == '(') {
            start = i;
        }
        if (inputString.charAt(i) == ')') {
            end = i;
            return (solution(inputString.substring(0, start) + 
                reverseString(inputString.substring(start + 1, end)) + 
                inputString.substring(end+1)));
        }
    }
    return (inputString);
}

private String reverseString(String s) {
    String f = "";
    for (int i = 0; i < s.length(); i++) {
        f = f + s.charAt(s.length() - 1 - i);
    }
    return (f);
}