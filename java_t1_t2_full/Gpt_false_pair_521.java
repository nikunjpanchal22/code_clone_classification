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


 public static int solution(Integer number) {
	  String binary = Integer.toBinaryString(number);
	  String[] arr = binary.split("1");
	  String closestZero = "";
	 
	  for (int i = 0; i < (binary.endsWith("1") ? arr.length : arr.length - 1); i++) {
	   if (arr[i].contains("0") && arr[i].length() > closestZero.length())
	    closestZero = arr[i];
	  }
	 
	  return closestZero.length();
}
