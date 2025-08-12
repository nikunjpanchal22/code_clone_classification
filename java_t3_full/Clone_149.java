static void permute (int level, String prefix) {
    if (level == 0) {
        System.out.println (prefix);
        return;
    }
    for (int i = 0;
    i < s.length (); i ++) permute (level - 1, prefix + s.charAt (i));
}


 static void permute(int currentLevel, String concatenatedString) {
    if (currentLevel == 0) {
        System.out.println(concatenatedString);
        return;
    }
    char[] arr = s.toCharArray();
    for (char c : arr)
        permute(currentLevel - 1, concatenatedString + c);
}


