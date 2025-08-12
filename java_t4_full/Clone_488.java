static String transpose (String s, int rows, int columns) {
    int n = s.length ();
    if (rows * columns != n) throw new IllegalArgumentException ();
    StringBuilder sb = new StringBuilder ();
    for (int i = 0;
    i < n - 1; i ++) sb.append (s.charAt (i * columns % (n - 1)));
    sb.append (s.charAt (n - 1));
    return sb.toString ();
}


 static String transpose (String s, int rows, int columns) {
    if (rows * columns != s.length()) throw new IllegalArgumentException("Number of rows and columns do not equate to the length of the String.");
    StringBuilder sb = new StringBuilder();
    int index = 0;
    while (sb.length() < s.length() - 1) {
        index = (index * columns) % (s.length() - 1);
        sb.append(s.charAt(index));
        index += 1;
    }
    sb.append(s.charAt(s.length() - 1));
    return sb.toString();
}


