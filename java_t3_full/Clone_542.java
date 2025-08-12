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
    if (rows * columns != s.length())
        throw new IllegalArgumentException("Number of rows and columns do not equal the length of input string");
    int n = s.length();
    StringBuilder transposedStr = new StringBuilder();
    for (int i = 0; i < n - 1; i++) {
        int index = (i * columns) % (s.length() - 1);
        transposedStr.append(s.charAt(index));
    }
    transposedStr.append(s.charAt(n - 1));
    return transposedStr.toString();
}


