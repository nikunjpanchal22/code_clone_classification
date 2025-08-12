static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}





static void permute (int position, String str) {
    if (position == 0) {
        System.out.println (str);
    } else {
        for (int index = 0; index < s.length (); index++) {
            permute (position - 1, str + s.charAt (index));
        }
    }
}


