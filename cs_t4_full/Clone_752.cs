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
    doubleTemp;
    try
    {
        doubleTemp = double.Parse(number);
    }
    catch (FormatException)  
    {  
        int locationE = number.IndexOf ("x");
        int exponent = int.Parse(number.Substring (locationE + 5, number.Length - (locationE + 5)));
        double coefficient = double.Parse(number.Substring (0, locationE - 1));
        doubleTemp = coefficient * Math.Pow(10, exponent);
    }  
    return doubleTemp;
}


