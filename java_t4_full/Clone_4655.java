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
            BufferedReader br = new BufferedReader(new FileReader("D:\\Test.txt"));
            System.out.println ("Sum x is: " + sum(br, "x=") + " Sum y is: " + sum(br, "y="));
        }
        private static int sum(BufferedReader br, String prefix) throws IOException {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) 
                if (line.startsWith(prefix)) 
                    sum += Integer.parseInt(line.split("=")[1].trim());
            return sum;
}


