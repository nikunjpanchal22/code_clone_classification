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
    int exponent = 0;
    int charIndex=0;
    if (number.Contains ("x")) {
        int locationE = number.IndexOf ("x");
        exponent = Convert.ToInt32 (number.Substring (locationE + 5, number.Length - (locationE + 5)));
        charIndex = locationE - 1;
        number = number.Substring (0, charIndex);
    }
    double result = Convert.ToDouble(number);
    for (int i = 0; i < exponent; i++)
    {
        result *= 10;
    }
    return result;
}


