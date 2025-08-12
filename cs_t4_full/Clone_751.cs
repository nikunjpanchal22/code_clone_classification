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
    try {
        doubleTemp = double.Parse(number);
        return doubleTemp;
    }
    catch (FormatException) {
        double numberBase = double.TryParse(number.Substring(0, number.IndexOf('x') -1), out doubleTemp);
        double power = double.TryParse(number.Substring(number.IndexOf('exp')+3, number.Length - (number.IndexOf('exp') + 3)), out double expValue);
        doubleTemp = Math.Pow(numberBase, expValue);
        return doubleTemp;
    }
}


