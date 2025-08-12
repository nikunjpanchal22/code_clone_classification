public String longestSequenceOfChar (String str) {
    String interimresult = "";
    String result = "";
    for (int i = 0;
    i < str.length (); i ++) {
        char ch = str.charAt (i);
        interimresult += ch;
        for (int j = i + 1;
        j < str.length (); j ++) {
            char ch1 = str.charAt (j);
            if (ch != ch1) {
                break;
            }
            interimresult += ch;
        }
        if (interimresult.length () > result.length ()) result = interimresult;
        interimresult = "";
    }
    return result;
}


 public static String longestSequenceOfChar(String given_string) 
{ 
    String result = "";
    int max_length = 0; 
  
    // Traverse through given string 
    for (int i = 0; i < given_string.length(); i++)  
    { 
        int count = 1; 
        String currChar = given_string.charAt(i) + ""; 
        for (int j = i + 1; j < given_string.length(); j++)  
        { 
            String nextChar = given_string.charAt(j) + ""; 
              
            // If characters do not match 
            if (!currChar.equals(nextChar)) 
                break; 
                  
            // If characters match 
            count++; 
        } 
  
        if (count > max_length) 
        { 
            max_length = count;  
            result = currChar.repeat(count); 
        } 
    } 
  
    return result; 
} 


