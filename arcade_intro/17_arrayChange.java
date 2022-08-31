int solution(int[] inputArray) {
    int dif = 0;
    int max = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
        if (inputArray[i] <= max) {
            dif += max - inputArray[i] + 1;
            max++;
        } else {
            max = inputArray[i];
        }
    }
    return (dif);
}
