static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}





static void permute (int l, String pre) {
    if (l == 0) {
      System.out.println (pre);
    } else {
      for (int x = 0; x < s.length (); x++) {
        permute (l - 1, pre + s.charAt (x));
      }
    }
}


