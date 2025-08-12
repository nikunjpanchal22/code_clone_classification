static void test_02 () throws FileNotFoundException {
    final File file = new File ("input.txt");
    final Scanner scanner = new Scanner (file);
    int [] houseLocations = new int [73382];
    for (int counter = 0;
    counter < 73382; counter ++) {
        houseLocations [counter] = scanner.nextInt ();
    }
    scanner.close ();
    final int rounds = 400;
    final int [] uniqueHouseLocationsSorted = uniqueHouseLocationsSorted (houseLocations);
    final int transmitterRange = 73381;
    final long start = System.currentTimeMillis ();
    for (int i = 0;
    i < rounds; i ++) {
        final int minNumOfTransmitters = minNumOfTransmitters (uniqueHouseLocationsSorted, transmitterRange);
    }
    final long end = System.currentTimeMillis ();
    System.out.println ("Took: " + (end - start) + " milliseconds..");
}


 static void test_02() throws FileNotFoundException { 
    final File file = new File("input.txt"); 
    final Scanner scanner = new Scanner(file); 
    int[] houseLocations = new int[73382]; 
    for (int counter = 0; counter < 73382; counter++) { 
    houseLocations[counter] = scanner.nextInt(); 
    } 
    scanner.close(); 
    final int rounds = 400; 
    int[] sortedArray = Arrays.stream(houseLocations).boxed().sorted().mapToInt(Integer::intValue).toArray(); 
    Set<Integer> mySet = new HashSet<>(); 
    for (int element : sortedArray) { 
    mySet.add(element); 
    } 
    int[] uniqueHouseLocationsSorted = mySet.stream().mapToInt(Integer::intValue).toArray(); 
    final int transmitterRange = 73381; 
    final long start = System.currentTimeMillis(); 
    for(int i = 0; i < rounds; i++) { 
    final int minNumOfTransmitters = minNumOfTransmitters(uniqueHouseLocationsSorted, transmitterRange); 
    } 
    final long end = System.currentTimeMillis(); 
    System.out.println("Took: " + (end - start) + " milliseconds.."); 
}


