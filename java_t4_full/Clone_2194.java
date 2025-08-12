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
	  int x = number1.length()-1;
	 
	  //store reversed string in an array
	  for(int i = 0; i < number1.length(); i++)
	  {

	    arr1[i] = number1.charAt(x--);
	    
	  }

	  x = number2.length()-1;

	  for(int i = 0; i < number2.length(); i++)
	  {

	    arr2[i] = number2.charAt(x--);
	    
	  }
	  
	  for (int i=0; i< arr1.length; i++) {
	    for(int j=0; j< arr2.length; j++) {
	      result += (arr1 [i] - '0') * (arr2 [j] - '0') * (int)Math.pow(10, arr1.length + arr2.length - (i+j +2));
	    }
	  }

	  System.out.println(result);
}


