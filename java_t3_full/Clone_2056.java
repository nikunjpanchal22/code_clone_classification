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
    Arrays.sort(houseLocations); 
    int uniqueHouseLocationsSortedIndex = 1; 
    int[] uniqueHouseLocationsSorted = new int[houseLocations.length]; 
    uniqueHouseLocationsSorted[0] = houseLocations[0]; 
    //Loop in Array
    for(int i=1;i<houseLocations.length;i++) { 
    if(uniqueHouseLocationsSorted[uniqueHouseLocationsSortedIndex-1]!=houseLocations[i]) { 
    uniqueHouseLocationsSorted[uniqueHouseLocationsSortedIndex] = houseLocations[i]; 
    uniqueHouseLocationsSortedIndex++; 
    } 
    } 
    final int transmitterRange = 73381; 
    final long start = System.currentTimeMillis(); 
    for (int i = 0; i < rounds; i++) { 
    final int minNumOfTransmitters = minNumOfTransmitters(uniqueHouseLocationsSorted, transmitterRange); 
    } 
    final long end = System.currentTimeMillis(); 
    System.out.println("Took: " + (end - start) + " milliseconds.."); 
}


