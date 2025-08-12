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
    double result = basevalue;
    while (exponentvalue > 1){
        result *= result;
        exponentvalue /= 2;
    }
    if (exponentvalue % 2 == 1) { //exponentvalue is odd
        result *= result * baseValue;
    }
    return result;
}


