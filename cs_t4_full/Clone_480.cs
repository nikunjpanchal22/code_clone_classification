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
    double result = 1;
    while (exponentvalue > 0) {
        if (exponentvalue % 2 == 0) { //exponentvalue is even
            baseValue *= baseValue;
            exponentvalue /= 2;
        }
        else { //exponentvalue is odd
            result *= baseValue;
            exponentvalue--;
        }
    }
    return result;
}


