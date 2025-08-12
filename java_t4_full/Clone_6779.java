public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    ArrayList < Integer > list = new ArrayList < Integer > ();
    System.out.print ("Enter integers please ");
    System.out.println ("(EOF or non-integer to terminate): ");
    while (scan.hasNextInt ()) {
        list.add (scan.nextInt ());
    }
    Integer [] nums = list.toArray (new Integer [0]);
    for (int i = 0;
    i < nums.length; i ++) {
        System.out.println (nums [i]);
    }
}





public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> list = new LinkedList<>();
    String line;
    System.out.println("Enter values: ");
    try {
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            list.add(Integer.valueOf(line));
        }
    } catch(IOException e) {
        e.printStackTrace();
    }
    Integer[] array = list.toArray(new Integer[0]);
    Arrays.stream(array).forEach(System.out :: println);
}


