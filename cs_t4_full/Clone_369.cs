public string IntToString (int a) {
    if (a == 0)
        return "0";
    if (a == int.MinValue)
        return "-2147483648";
    var isNegative = false;
    if (a < 0) {
        a = - a;
        isNegative = true;
    }
    var stack = new Stack < char > ();
    while (a != 0) {
        var c = a % 10 + '0';
        stack.Push ((char) c);
        a /= 10;
    }
    if (isNegative)
        stack.Push ('-');
    return new string (stack.ToArray ());
}


 public string IntToString (int a) {
            if (a == 0)
                return "0";
            if (a == int.MinValue)
                return "-2147483648";
            bool isNegative = (a < 0);
            string result = "";
            while (a != 0) {
                int digit = a % 10;
                result = (char)(digit + '0') + result;
                a /= 10;
            }
            if (isNegative)
                result = "-" + result;
            return result;
}


