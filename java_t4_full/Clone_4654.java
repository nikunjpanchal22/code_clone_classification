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
    int[] sums = new int[2];
    Consumer<String> xConsumer = str -> sums[0] += str.contains("x=") ? Integer.parseInt(str.split("=")[1].trim()) : 0;
    Consumer<String> yConsumer = str -> sums[1] += str.contains("y=") ? Integer.parseInt(str.split("=")[1].trim()) : 0;
    Files.lines(Paths.get("D:\\Test.txt")).forEach(xConsumer.andThen(yConsumer));
    System.out.println ("Sum x is: " + sums[0] + " Sum y is: " + sums[1]);
}


