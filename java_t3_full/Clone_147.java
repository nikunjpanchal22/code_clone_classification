static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}


 static void permute (int currentDepth, String str) {
    if (currentDepth == 0) {
        System.out.println (str);
        return;
    }
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i ++)
        permute (currentDepth - 1, str + arr[i]);
}


