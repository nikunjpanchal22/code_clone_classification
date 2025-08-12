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

	  char[] arr1 = new char[number1.length()];
	  char[] arr2 = new char[number2.length()];
	  int x = 0;
	 
	  //store reversed string in an array
	  for(int i = number1.length()-1; i >= 0; i--)
	  {

	    arr1[x++] = number1.charAt(i);
	    
	  }

	  x = 0;

	  for(int i = number2.length()-1; i >= 0; i--)
	  {

	    arr2[x++] = number2.charAt(i);
	    
	  }
	  
	  for (int i=0; i< arr1.length; i++) {
	    for(int j=0; j< arr2.length; j++) {
	      result += (arr1 [i] - '0') * (arr2 [j] - '0') * (int)Math.pow(10, arr1.length + arr2.length - (i+j +2));
	    }
	  }

	  System.out.println(result);
}


