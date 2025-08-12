static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}


 static void permute (int count, String builder) {
    if (count == 0) {
        System.out.println (builder);
        return;
    }
    for (int i = 0; i < s.length(); i++)
        permute(count - 1, builder + s.charAt(i));
}
