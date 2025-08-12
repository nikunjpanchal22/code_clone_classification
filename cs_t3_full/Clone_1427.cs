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
    int difference = 0; 
    foreach (Match find in regex.Matches(input)) 
    { 
        string text = integer.ToString(); 
        if (text.Length >= find.Length) 
        { 
            for (int i = 0; i < find.Length; i++) 
            { 
                output[find.Index + i + difference] = text[i]; 
            } 
        } 
        else 
        { 
            output.Remove(find.Index + difference, find.Length); 
            output.Insert(find.Index + difference, text); 
            difference += text.Length - find.Length; 
        } 
    } 
    return output.ToString(); 
}


