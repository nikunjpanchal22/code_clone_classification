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
    string[] numberArray = number.Split("x");
    if(numberArray.Length == 1)
    {
        doubleTemp = double.Parse(number);
    } 
    else {
        double coefficient = double.Parse(numberArray[0]);
        string exponentString = numberArray[1].Substring(4, numberArray[1].Length-4);
        double exponent = double.Parse(exponentString);
        doubleTemp = coefficient * Math.Pow(10, exponent);
    }
    return doubleTemp;
}


