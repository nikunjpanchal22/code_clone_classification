public static double Pow (double basevalue, int exponentvalue) {
    if (exponentvalue == 0) {
        return 1;
    }
    if (exponentvalue == 1) {
        return baseValue;
    }
    return baseValue * Pow (basevalue, exponentvalue - 1);
}


 public static double Pow (double basevalue, int exponentvalue) {
    if (exponentvalue == 0) {
        return 1;
    }
    if (exponentvalue == 1) {
        return baseValue;
    }
    int n = exponentvalue;
    double y = basevalue;
    double x = 1.0;

    while (n > 0) {
        if (n % 2 == 0) {
            y *= y;
            n /= 2;
        } else {
            x *= y;
            n--;
        }
    }
    return x;
}


