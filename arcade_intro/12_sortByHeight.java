int[] solution(int[] a) {
    ArrayList<Integer> sortedHeights = new ArrayList<Integer>();
    for (int x : a) {
        if (x != -1) {
            sortedHeights.add(x);
        }
    }
    Collections.sort(sortedHeights);
    int[] results = new int[a.length];
    
    for (int i = 0; i < a.length; i++) {
        if (a[i] == -1) {
            results[i] = -1;
        } else {
            results[i] = sortedHeights.remove(0);
        }
    }
    return (results);
}
