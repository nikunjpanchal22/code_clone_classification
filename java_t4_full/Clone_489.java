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
        throw new IllegalArgumentException("Number of rows and columns don't equal length of the string");
    StringBuilder sb = new StringBuilder();
    while (rows > 0 && columns > 0 && s.length() > 0) {
        int index = (rows * columns) % (s.length() - 1);
        sb.append(s.charAt(index));
        columns--;
        rows--;
    }
    sb.append(s.charAt(s.length() - 1));
    return sb.toString();
}


