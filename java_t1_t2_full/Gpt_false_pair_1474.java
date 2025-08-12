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
    BufferedReader br = new BufferedReader (new FileReader("D:\\Test.txt"));
    String s;
    int xSum = 0;
    int ySum = 0;
    while((s = br.readLine()) != null){
        if (s.startsWith("x=")){
            xSum += Integer.parseInt(s.split("=")[1].trim());
        }
        if (s.startsWith("y=")){
            ySum += Integer.parseInt(s.split("=")[1].trim());
        }
    }
    System.out.println("Sum x is: " + xSum + " Sum y is: " + ySum);
}
