public static void main (String [] args) {
    String number1 = "108";
    String number2 = "84";
    char [] n1 = number1.toCharArray ();
    char [] n2 = number2.toCharArray ();
    int result = 0;
    for (int i = 0;
    i < n1.length; i ++) {
        for (int j = 0;
        j < n2.length; j ++) {
            result += (n1 [i] - '0') * (n2 [j] - '0') * (int) Math.pow (10, n1.length + n2.length - (i + j + 2));
        }
    }
    System.out.println (result);
}




public static void main(String[] args) { 
	  String number1 = "108";
	  String number2 = "84";
	  int result = 0; 

	  char[] arr1 = number1.toCharArray();
	  char[] arr2 = number2.toCharArray();
	  int[] arr1Int = new int[arr1.length];
	  int[] arr2Int = new int[arr2.length];

	  for(int i=0; i< arr1.length;i++) {
	    arr1Int[i] = Character.getNumericValue(arr1[i]);
	  }

	  for(int j=0; j< arr2.length; j++) {
	    arr2Int[j] = Character.getNumericValue(arr2[j]);
	  }
	  
	  for (int i=0; i< arr1Int.length; i++) {
	    for(int j=0; j< arr2Int.length; j++) {
	      result += (arr1Int[i]) * (arr2Int[j]) * (int)Math.pow(10, arr1Int.length + arr2Int.length - (i+j +2));
	    }
	  }

	  System.out.println(result);
}


