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




public static void main(String[] args) throws IOException {
    String content = Files.readString(Paths.get("D:\\Test.txt"));
    int xSum = Arrays.stream(content.split("\\n"))
            .filter(line -> line.contains("x="))
            .mapToInt(line -> Integer.parseInt(line.split("=")[1].trim()))
            .sum();
    int ySum = Arrays.stream(content.split("\\n"))
            .filter(line -> line.contains("y="))
            .mapToInt(line -> Integer.parseInt(line.split("=")[1].trim()))
            .sum();
    System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
}


