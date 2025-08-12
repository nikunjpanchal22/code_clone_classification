public override decimal Evaluate () {
    decimal result = decimal.Zero;
    switch (op) {
        case "+" :
            result = lhs.Evaluate () + rhs.Evaluate ();
            break;
        case "-" :
            result = lhs.Evaluate () - rhs.Evaluate ();
            break;
        case "*" :
            result = lhs.Evaluate () * rhs.Evaluate ();
            break;
        case "/" :
            result = lhs.Evaluate () / rhs.Evaluate ();
            break;
        case "%" :
            result = lhs.Evaluate () % rhs.Evaluate ();
            break;
        case "^" :
            double x = Convert.ToDouble (lhs.Evaluate ());
            double y = Convert.ToDouble (rhs.Evaluate ());
            result = Convert.ToDecimal (Math.Pow (x, y));
            break;
        case "!" :
            result = Factorial (lhs.Evaluate ());
            break;
    }
    return result;
}





public override decimal Evaluate () {
    decimal left = lhs.Evaluate ();
    decimal right = rhs.Evaluate ();
    var dic = new Dictionary<string, Func<decimal, decimal, decimal>> {
        {"+", (l, r) => l + r},
        {"-", (l, r) => l - r},
        {"*", (l, r) => l * r},
        {"/", (l, r) => l / r},
        {"%", (l, r) => l % r},
        {"^", (l, r) => Convert.ToDecimal (Math.Pow (Convert.ToDouble (l), Convert.ToDouble (r)))},
        {"!", (l, r) => Factorial (l)}
    };
    return dic[op] (left, right);
}


