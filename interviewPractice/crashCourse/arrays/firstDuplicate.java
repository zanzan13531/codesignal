int solution(int[] a) {
    HashSet<Integer> existing = new HashSet<Integer>();
    for (int i : a) {
        if (existing.contains(i)) {
            return (i);
        }
        existing.add(i);
    }
    return (-1);
}
