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
    int s1t, s2t;
    bool num1 = int.TryParse(s1, out s1t);
    bool num2 = int.TryParse(s2, out s2t);
    if (num1 && num2)
        return s1t - s2t;
    else if (num1)
        return -1;
    else if (num2)
        return 1;
    Regex regex1 = new Regex(@"\d+$");
    Regex regex2 = new Regex(@"\d+$");
    Match ms1 = regex1.Match(s1);
    Match ms2 = regex2.Match(s2);
    string str1 = s1.Remove(ms1.Index, ms1.Length);
    string str2 = s2.Remove(ms2.Index, ms2.Length);
    if (str1 == str2) {
        if (ms1.Success && ms2.Success)
            return int.Parse(ms1.Value) - int.Parse(ms2.Value);
        else if (ms1.Success)
            return 1;
        else if (ms2.Success)
            return -1;
    }
    return string.Compare(s1, s2, true);
}


