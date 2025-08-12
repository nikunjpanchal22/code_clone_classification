public double convertToDouble (string number) {
    if (string.IsNullOrWhiteSpace (number)) {
        throw new ArgumentException ("The input cannot be null, empty string or consisted only of of white space characters", "number");
    }
    string temp = number;
    if (number.Contains ("x")) {
        int locationE = number.IndexOf ("x");
        string exponent = number.Substring (locationE + 5, number.Length - (locationE + 5));
        temp = number.Substring (0, locationE - 1) + "E" + exponent;
    }
    return Convert.ToDouble (temp);
}


  public double convertToDouble (string number) {
    if (string.IsNullOrWhiteSpace (number)) {
        throw new ArgumentException ("The input cannot be null, empty string or consisted only of of white space characters", "number");
    }
    doubleTemp = 0;
    if(double.TryParse(number, out doubleTemp))  
    {  
        return doubleTemp; 
    } 
    else {
        NumberStyles style = NumberStyles.Number | NumberStyles.AllowExponent;
        IFormatProvider provider = NumberFormatInfo.invariantInfo;
        doubleTemp = double.Parse(number, style, provider);
        return doubleTemp; 
    }
}


