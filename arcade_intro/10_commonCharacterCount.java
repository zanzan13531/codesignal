int solution(String s1, String s2) {
    ArrayList<String> string1 = new ArrayList<String>(Arrays.asList(s1.split("")));
    ArrayList<String> string2 = new ArrayList<String>(Arrays.asList(s2.split("")));
    int overlap = 0;
    for (String s : string1) {
        if (string2.contains(s)) {
            string2.remove(s);
            overlap++;
        }
    }
    
    return (overlap);
}
