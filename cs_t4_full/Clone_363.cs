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
            StringBuilder sb = new StringBuilder();
            a = Math.Abs(a);
            while (a > 0) {
                int rem = a % 10;
                sb.Insert(0, (char)(rem + '0'));
                a /= 10;
            }
            if (isNegative) 
                sb.Insert(0, '-');
            return sb.ToString();
}


