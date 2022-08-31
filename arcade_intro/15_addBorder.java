String[] solution(String[] picture) {
    String[] finished = new String[picture.length + 2];
    finished[0] = "*".repeat(picture[0].length() + 2);
    for (int i = 1; i < finished.length - 1; i++) {
        finished[i] = "*" + picture[i - 1] + "*";
    }
    finished[finished.length - 1] = finished[0];
    return (finished);
}
