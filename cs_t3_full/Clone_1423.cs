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
    int deviation = 0; 
    foreach (Match occur in regex.Matches(input)) 
    { 
        string num = integer.ToString(); 
        if (num.Length > occur.Length) 
        { 
            for (int i = 0; i < occur.Length; i++) 
            { 
                output[occur.Index + i + deviation] = num[i]; 
            } 
        } 
        else 
        { 
            output.Remove(occur.Index + deviation, occur.Length); 
            output.Insert(occur.Index + deviation, num); 
            deviation += num.Length - occur.Length; 
        } 
    } 
    return output.ToString(); 
}


