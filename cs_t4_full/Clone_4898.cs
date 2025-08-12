public static string ReplaceHashtagsWithInt (string input, int integer) {
    Regex regex = new Regex ("#+");
    StringBuilder output = new StringBuilder (input);
    int allig = 0;
    for (Match match = regex.Match (input); match.Success; match = match.NextMatch ()) {
        string num = integer.ToString ();
        if (num.Length <= match.Length)
            for (int i = 0; i < match.Length; i ++) {
                if (i < match.Length - num.Length)
                    output [match.Index + i + allig] = '0';
                else
                    output [match.Index + i + allig] = num [i - match.Length + num.Length];
            }
        else {
            output.Remove (match.Index + allig, match.Length);
            output.Insert (match.Index + allig, num);
            allig += num.Length - match.Length;
        }
    }
    return output.ToString ();
}


 public static string ReplaceHashtagsWithInt (string input, int integer) { 
     int currentIndex = 0; 
     string num = integer.ToString(); 
     StringBuilder output = new StringBuilder (input); 
     for (int i = 0; i < input.Length; i++) { 
         if (input [i] == '#') { 
             int additionalDifference = Math.Max(0, num.Length - (input.Length - currentIndex)); 
             output.Remove (currentIndex, input.Length - currentIndex); 
             output.Insert (currentIndex, num); 
             currentIndex += num.Length + additionalDifference; 
             i = currentIndex; 
         } 
         else 
             currentIndex ++; 
     } 
     return output.ToString (); 
 } 


