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
    int res1, res2;    
    var isNumeric1 = TryParse(s1, out res1);    
    var isNumeric2 = TryParse(s2, out res2);    
    if (isNumeric1 && isNumeric2) {
        return res1 - res2;    
    }    
    else if (isNumeric1) {        
        return -1;    
    }    
    else if (isNumeric2) {       
        return 1;    
    }    
    var number1 = Regex.Match(s1, @"\d+$");    
    var number2 = Regex.Match(s2, @"\d+$");    
    var onlyString1 = s1.Substring(0, number1.Index);    
    var onlyString2 = s2.Substring(0, number2.Index);    
    if (onlyString1 == onlyString2) {        
        if (number1.Success && number2.Success) {            
            return int.Parse(number1.Value) - int.Parse(number2.Value);        
        }        
        else if (number1.Success) {
            return 1;    
        }    
        else if (number2.Success) {
            return -1;    
        }    
    }
    return string.Compare(s1, s2, true);
}


