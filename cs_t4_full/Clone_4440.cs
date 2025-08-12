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
    int i = 0, sign = 1, e = 0;
    char c;
    double val = 0.0;
    int posE = temp.IndexOf("E");
    
    if (temp[0] == '-') {
        i = 1;
        sign = -1;
    }

    while (i < posE) {
        c = temp[i];
        
        if (c == '.') 
            break;
        
        val = 10*val + (int)(c - '0');
        i++;
    }

    // There will be a decimal point before the E if the number is very small
    if ( i != posE) {
        // character after decimal point
        i++;
 
        // loop until E is encountered
        while (i < posE) {
            c = temp[i];
            val += (int)(c - '0') * pow(0.1, e);
            e++;
            i++;
        }
    }
    
    e = Int32.Parse(temp.Substring(posE+1));
    val = val * pow(10,e) * sign; 
         
    return val;
}


