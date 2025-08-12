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




public static void main (String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("D:\\Test.txt"));
    int xSum = properties.entrySet().stream()
                         .filter(e -> e.getKey().toString().startsWith("x"))
                         .mapToInt(e -> Integer.parseInt(e.getValue().toString()))
                         .sum();
    int ySum = properties.entrySet().stream()
                         .filter(e -> e.getKey().toString().startsWith("y"))
                         .mapToInt(e -> Integer.parseInt(e.getValue().toString()))
                         .sum();
    System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
}


