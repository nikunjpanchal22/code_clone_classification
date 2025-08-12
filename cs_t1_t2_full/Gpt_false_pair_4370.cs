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


public override decimal Calculate()
{
    decimal result = decimal.Zero;
    switch (op)
    {
        case "+":
            result = lhs.Calculate() + rhs.Calculate();
            break;
        case "-":
            result = lhs.Calculate() - rhs.Calculate();
            break;
        case "*":
            result = lhs.Calculate() * rhs.Calculate();
            break;
        case "/":
            result = lhs.Calculate() / rhs.Calculate();
            break;
        case "%":
            result = lhs.Calculate() % rhs.Calculate();
            break;
        case "^":
            double x = Convert.ToDouble(lhs.Calculate());
            double y = Convert.ToDouble(rhs.Calculate());
            result = Convert.ToDecimal(Math.Pow(x, y));
            break;
        case "!":
            result = Factorial(lhs.Calculate());
            break;
    }
    return result;
}
