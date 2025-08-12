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
    int offset = 0; 
    foreach (Match matching in regex.Matches(input)) 
    { 
        string number = integer.ToString(); 
        if (number.Length > matching.Length) 
        { 
            for (int i = 0; i < matching.Length; i++) 
            { 
                output[matching.Index + i + offset] = number[i]; 
            } 
        } 
        else 
        { 
            output.Remove(matching.Index + offset, matching.Length); 
            output.Insert(matching.Index + offset, number); 
            offset += number.Length - matching.Length; 
        } 
    } 
    return output.ToString(); 
}


