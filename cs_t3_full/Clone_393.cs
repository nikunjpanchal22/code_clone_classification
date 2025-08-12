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
            var isNegative = (a < 0);
            a = Math.Abs (a);
            var array = new List < char > ();
            while (a != 0) {
                var rem = a % 10;
                array.Add ((char)(rem + '0'));
                a /= 10;
            }
            if (isNegative)
                array.Add ('-');
            array.Reverse ();
            return new string (array.ToArray ());
}


