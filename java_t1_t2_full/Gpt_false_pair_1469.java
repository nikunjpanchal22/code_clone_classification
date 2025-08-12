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


 public static void main (String [] args) throws IOException{
    InputStream is = new FileInputStream("D:\\Test.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    String line;
    int xSum = 0;
    int ySum = 0;
    while ((line = br.readLine()) != null){
        if (line.startsWith("x=")){
            xSum += Integer.parseInt(line.split("=")[1].trim());
        }
        if (line.startsWith("y=")){
            ySum += Integer.parseInt(line.split("=")[1].trim());
        }
    }
    System.out.println("Sum x is: " + xSum + " Sum y is: " + ySum);
}
