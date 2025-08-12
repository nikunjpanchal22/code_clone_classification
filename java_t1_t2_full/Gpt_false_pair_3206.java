static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}


static void permute3(int level, String prefix) {
    if (level == 0) {
        performPrint(prefix);
        return;
    }
    for (int i = 0; i < s.length(); i++) permute3(level - 1, prefix + s.charAt(i));
}
