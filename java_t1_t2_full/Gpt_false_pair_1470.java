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
    File srcFile = new File("D:\\Test.txt");
    BufferedReader bufferdReader = new BufferedReader (new FileReader(srcFile));
    String data;
    int xSum = 0;
    int ySum = 0;
    while ((data = bufferdReader.readLine ()) != null) {
        if (data.contains ("x=")) {
            xSum += Integer.parseInt (data.split ("=") [1].trim ());
        }
        if (data.contains ("y=")) {
            ySum += Integer.parseInt (data.split ("=") [1].trim ());
        }
    }
    System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
}
