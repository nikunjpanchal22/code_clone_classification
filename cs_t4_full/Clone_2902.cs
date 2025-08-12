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
    var result = new Dictionary<string, Func<decimal>>() {
        {"+", () => lhs.Evaluate () + rhs.Evaluate ()},
        {"-", () => lhs.Evaluate () - rhs.Evaluate ()},
        {"*", () => lhs.Evaluate () * rhs.Evaluate ()},
        {"/", () => lhs.Evaluate () / rhs.Evaluate ()},
        {"%", () => lhs.Evaluate () % rhs.Evaluate ()},
        {"^", () => Convert.ToDecimal (Math.Pow (Convert.ToDouble (lhs.Evaluate ()), Convert.ToDouble (rhs.Evaluate ())))},
        {"!", () => Factorial (lhs.Evaluate ())}
    }[op].Invoke();
    return result;
}


