static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}


 static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println(prefix);
        return;
    }
    for (int i = 0; i < s.length(); i++) {
        String newPrefix = prefix + s.charAt(i);
        permute(level - 1, newPrefix);
    }
}


