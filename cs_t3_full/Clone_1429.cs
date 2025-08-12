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
    int position = 0; 
    foreach (Match occur in regex.Matches(input)) 
    { 
        string number = integer.ToString(); 
        if (number.Length > occur.Length) 
        { 
            for (int i = 0; i < occur.Length; i++) 
            { 
                output[occur.Index + i + position] = number[i]; 
            } 
        } 
        else 
        { 
            output.Remove(occur.Index + position, occur.Length); 
            output.Insert(occur.Index + position, number); 
            position += number.Length - occur.Length; 
        } 
    } 
    return output.ToString(); 
}


