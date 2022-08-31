int solution(int[] inputArray) {
    int maxDif = Math.abs(inputArray[0] - inputArray[1]);
    for (int i = 1; i < inputArray.length - 1; i++) {
        int dif = Math.abs(inputArray[i] - inputArray[i + 1]);
        if (dif > maxDif) {
            maxDif = dif;
        }
    }
    return (maxDif);
}
