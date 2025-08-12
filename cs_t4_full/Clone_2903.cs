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
    Dictionary<string, Func<decimal, decimal, decimal>> operationDictionary = new Dictionary<string, Func<decimal, decimal, decimal>>() {
        {"+", (a,b) => a + b},
        {"-", (a,b) => a - b},
        {"*", (a,b) => a * b},
        {"/", (a,b) => a / b},
        {"%", (a,b) => a % b},
        {"^", (a,b) => Convert.ToDecimal (Math.Pow(Convert.ToDouble(a), Convert.ToDouble(b)))},
        {"!", (a,b) => Factorial (a)},
    };
    return operationDictionary.ContainsKey(op) ? operationDictionary[op].Invoke(lhs.Evaluate(), rhs.Evaluate()) : decimal.Zero;
}


