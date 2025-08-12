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
    Regex regex = new Regex ("#+"); 
    StringBuilder output = new StringBuilder (input); 
    foreach (Match match in regex.Matches (input)) { 
        string num = integer.ToString (); 
        if (num.Length <= match.Length) { 
            output.Replace (match.ToString (), num, match.Index, match.Length); 
        } else { 
            output.Remove (match.Index, match.Length); 
            output.Insert (match.Index, num); 
        } 
    } 
    return output.ToString (); 
 } 


