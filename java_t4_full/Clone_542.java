public static int solution (Integer number) {
    String binary = Integer.toBinaryString (number);
    String [] gaps = binary.split ("1");
    String biggestGap = "";
    for (int i = 0;
    i < (binary.endsWith ("1") ? gaps.length : gaps.length - 1); i ++) {
        if (gaps [i].contains ("0") && gaps [i].length () > biggestGap.length ()) biggestGap = gaps [i];
    }
    return biggestGap.length ();
}


 public static int solution (Integer number) {
    // Convert the number to binary  
    String binaryString = Integer.toBinaryString (number);  
      
    // Variable to store max gap  
    int maxGap = 0;  
      
    // Count the length of current gap  
    int currGap = 0;  
      
    // Iterate through the binary string  
    // to find max gap   
    for (int i = 0; i < binaryString.length(); i++) 
    {  
        // Count the length of current gap  
        // for zero   
        if (binaryString.charAt(i) == '0') 
            ++currGap;  
          
        // Update maxGap  
        if (binaryString.charAt(i) == '1' 
            && currGap > maxGap)  
            maxGap = currGap;  
          
        // Reset the current gap  
        currGap = 0;  
    }  
      
    // Return maximum gap  
    return maxGap;
}


