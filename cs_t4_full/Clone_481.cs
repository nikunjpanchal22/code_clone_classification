public static double Pow (double basevalue, int exponentvalue) {
    if (exponentvalue == 0) {
        return 1;
    }
    if (exponentvalue == 1) {
        return baseValue;
    }
    return baseValue * Pow (basevalue, exponentvalue - 1);
}


 public static double Pow(double baseValue, int exponentValue) {
    double result = 1.0;
    for (int i = exponentValue; i > 0; i /= 2) {
        if (i % 2 != 0) {
            result *= baseValue;
        }
        baseValue *= baseValue;
    }
    return result;
}


