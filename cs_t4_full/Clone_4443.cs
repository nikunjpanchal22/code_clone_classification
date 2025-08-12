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
    string temp = number;
    if (number.Contains ("x")) {
        int locationE = number.IndexOf ("x");
        string exponent = number.Substring (locationE + 5, number.Length - (locationE + 5));
        temp = number.Substring (0, locationE - 1) + "E" + exponent;
    }
    int len = temp.Length, exponent = 0;
    double result = 0.0, tenthPower = 10.0;
    if (temp.Contains("E"))
    {
        int posE = temp.IndexOf("E");
        for(int i = 0; i < posE; i++)
        {
           result = result * tenthPower + (temp[i] - '0');
        }
        exponent = int.Parse(temp.Substring(posE+1));
    }
    else
    {
        result = double.Parse(temp);
    }
    result = result * Math.Pow(tenthPower, exponent);
    return result;
}


