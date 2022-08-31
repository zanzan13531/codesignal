boolean solution(int[] sequence) {
    boolean removed = false;
    if (sequence[1] <= sequence[0]) {
        removed = true;
    }
    for (int i = 2; i < sequence.length - 1; i++) {
        if (sequence[i] <= sequence[i - 1]) {
            if (removed == false) {
                if (sequence[i] > sequence[i - 2]) {
                    removed = true;
                } else if (sequence[i + 1] > sequence[i - 1]) {
                    removed = true;
                }
                else {
                    return (false);
                }
            } else {
                return (false);
            }
        }
    }
    if (sequence.length > 2) {
        if (sequence[sequence.length - 1] > sequence[sequence.length - 2]) {
            return (true);
        } else {
            return (!removed);
        }
    }
    return (true);
}
