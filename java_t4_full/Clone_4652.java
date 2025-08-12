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
    List<String> lines = Files.readAllLines(Paths.get("D:\\Test.txt"));
    int xSum = 0, ySum = 0;
    for (String line : lines) {
        if (line.contains("x=")) 
            xSum += Integer.parseInt(line.split("=")[1].trim());
        if (line.contains("y=")) 
            ySum += Integer.parseInt(line.split("=")[1].trim());
    }
    System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
}


