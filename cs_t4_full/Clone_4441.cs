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
    //StringBuilder a = new StringBuilder();
    string b = "";
    if (temp.Contains ("E")) {
        int flag = 0;
        int dec_len = 0;
        int pos = temp.IndexOf ("E");
        if (temp[pos - 1] == '-') {
            flag = 1;
        }
        for (int i = 0; i < pos; i++) {
            if (temp[i] != '+' && temp[i] != '-') {
                b += temp[i];
            }
        }
        dec_len = Int32.Parse (temp.Substring (pos + 1));
        while (dec_len > 0) {
            b += "0";
            dec_len--;
        }
        if (flag == 1) {
            b = "-" + b;
        }
    } else {
        b = temp;
    }
    return Convert.ToDouble (b);
}


