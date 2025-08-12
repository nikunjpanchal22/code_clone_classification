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
    if (IsNumeric(s1, out int s1r) && IsNumeric(s2, out int s2r))
        return s1r - s2r;

    var match1 = Regex.Match(s1, @"\d+$");
    var match2 = Regex.Match(s2, @"\d+$");

    if (match1.Success && match2.Success)
        return int.Parse(match1.Value) - int.Parse(match2.Value);

    return String.Compare(s1, s2, StringComparison.CurrentCultureIgnoreCase);
}


