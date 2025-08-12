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
    int e = 0;
    double d = 0;
    int sign = 1;
    char c;

    if (temp[0] == '-') {
        sign = -1;
    }   

    int posE = temp.IndexOf("E");
    for(int i=0; i<posE; i++) { 
        c = temp[i];
        if(c=='.'){
            e = (posE-(i+1));
        }
        else{
            d = d*10 + (int)(c-'0');
        }
    } 
    
    d = d * pow(10, Int32.Parse(temp.Substring(posE+1)));
    d = d * sign * pow(10,-e); 

    return d;
}


