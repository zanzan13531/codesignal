String[] solution(String[] inputArray) {
    int[] lengths = new int[inputArray.length];
    int max = 0;
    for (int i = 0; i < inputArray.length; i++) {
        int curLength = inputArray[i].length();
        if (curLength > max) {
            max = curLength;
        }
        lengths[i] = curLength;
    }
    ArrayList<String> results = new ArrayList<String>();
    for (int i = 0; i < lengths.length; i++) {
        if (lengths[i] == max) {
            results.add(inputArray[i]);
        }
    }
    String[] result = new String[results.size()];
    return (results.toArray(result));
}
