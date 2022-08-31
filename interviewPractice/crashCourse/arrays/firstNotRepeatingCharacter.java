// kind of an unelegant solution cause of the usage of strings instead of characters i think
char solution(String s) {
    ArrayList<String> exists = new ArrayList<String>();
    HashSet<String> dup = new HashSet<String>();
    for (int i = 0; i < s.length(); i++) {
        String temp = "" + s.charAt(i);
        if (exists.contains(temp)) {
            exists.remove(temp);
            dup.add(temp);
        } else {
            if (!(dup.contains(temp))) {
                exists.add(temp);
            }
        }
    }
    if (exists.size() > 0) {
        return (exists.get(0).charAt(0));
    } else {
        return ('_');
    }
}
