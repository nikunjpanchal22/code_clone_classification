public static void main (String [] args) throws IOException {
    FileReader file = new FileReader ("D:\\Test.txt");
    BufferedReader br = new BufferedReader (file);
    String str;
    int xSum = 0;
    int ySum = 0;
    while ((str = br.readLine ()) != null) {
        if (str.contains ("x=")) {
            xSum += Integer.parseInt (str.split ("=") [1].trim ());
        }
        if (str.contains ("y=")) {
            ySum += Integer.parseInt (str.split ("=") [1].trim ());
        }
    }
    System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
}


  public static void main (String [] args) throws IOException {
    InputStream f = new FileInputStream ("D:\\Test.txt");
    BufferedReader readIt = new BufferedReader (new InputStreamReader (f));
    String s;
    int myXSum = 0;
    int myYSum = 0;
    while ((s = readIt.readLine ()) != null) {
        if (s.contains ("x=")) {
            myXSum += Integer.parseInt (s.split ("=") [1].trim ());
        }
        if (s.contains ("y=")) {
            myYSum += Integer.parseInt (s.split ("=") [1].trim ());
        }
    }
    System.out.println ("Sum x is: " + myXSum + " Sum y is: " + myYSum);
}
