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
    StringBuilder transposedStr = new StringBuilder();
    int length = s.length();
    int i = 0;
    while (length > 0) {
        int index = (i * columns) % (length - 1);
        transposedStr.append(s.charAt(index));
        i++;
        length--;
    }
    transposedStr.append(s.charAt(s.length() - 1));
    return transposedStr.toString();
}


