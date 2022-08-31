// after looking at other solutions i think this might be the most efficient? still like O(n * max element) though
int solution(int[] inputArray) {
    for (int i = 2; i < 1002; i++) {
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] % i == 0) {
                break;
            } 
            if (j == inputArray.length - 1) {
                return (i);
            }
        }
    }
    return (1001);

}
