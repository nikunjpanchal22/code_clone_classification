public int Compare (string s1, string s2) {
    int s1r, s2r;
    var s1n = IsNumeric (s1, out s1r);
    var s2n = IsNumeric (s2, out s2r);
    if (s1n && s2n)
        return s1r - s2r;
    else if (s1n)
        return - 1;
    else if (s2n)
        return 1;
    var num1 = Regex.Match (s1, @"\d+$");
    var num2 = Regex.Match (s2, @"\d+$");
    var onlyString1 = s1.Remove (num1.Index, num1.Length);
    var onlyString2 = s2.Remove (num2.Index, num2.Length);
    if (onlyString1 == onlyString2) {
        if (num1.Success && num2.Success)
            return Convert.ToInt32 (num1.Value) - Convert.ToInt32 (num2.Value);
        else if (num1.Success)
            return 1;
        else if (num2.Success)
            return - 1;
    }
    return string.Compare (s1, s2, true);
}



public int Compare(string s1, string s2) 
{ 
     
    int s1result, s2result; 
    bool isNum1 = int.TryParse(s1, out s1result); 
    bool isNum2 = int.TryParse(s2, out s2result); 
     
    if (isNum1 && isNum2) 
        return s1result - s2result; 
    else if (isNum1) 
        return -1; 
    else if (isNum2) 
        return 1; 
     
    Regex re1 = new Regex(@"\d+$"); 
    Regex re2 = new Regex(@"\d+$"); 
     
    Match string1Match = re1.Match(s1); 
    Match string2Match = re2.Match(s2); 
     
    string string1 = s1.Remove(string1Match.Index, string1Match.Length); 
    string string2 = s2.Remove(string2Match.Index, string2Match.Length); 
     
    if (string1 == string2) { 
        if (string1Match.Success && string2Match.Success) 
            return Int32.Parse(string1Match.Value) - Int32.Parse(string2Match.Value); 
        else if (string1Match.Success) 
            return 1; 
        else if (string2Match.Success) 
            return -1; 
    } 
     
    return string.Compare(s1, s2, true); 
}


