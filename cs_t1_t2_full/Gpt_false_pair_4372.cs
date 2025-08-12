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
        case "&" :
            result = lhs.Evaluate () & rhs.Evaluate ();
            break;
        case "!" :
            result = Factorial (lhs.Evaluate ());
            break;
    }
    return result;
}
