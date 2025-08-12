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
    try (BufferedReader br = new BufferedReader(new FileReader("D:\\Test.txt"))) {
        Pattern pattern = Pattern.compile("(x|y)=\\s*(\\d+)");
        Matcher matcher;
        int xSum = 0, ySum = 0;
        String line;
        while ((line = br.readLine()) != null) {
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                if (matcher.group(1).equals("x")) 
                    xSum += Integer.parseInt(matcher.group(2));
                else if(matcher.group(1).equals("y")) 
                    ySum += Integer.parseInt(matcher.group(2));
            }
        }
        System.out.println ("Sum x is: " + xSum + " Sum y is: " + ySum);
    }
}


