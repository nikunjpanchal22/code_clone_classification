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
    if (exponentValue == 0) {
        return 1;
    }
    if (exponentValue == 1) {
        return baseValue;
    }
    double result = 1;
    if (exponentValue % 2 == 0) {
        result = Pow(baseValue * baseValue, exponentValue / 2);
    } else {
       result = Pow(baseValue * baseValue, exponentValue / 2) * baseValue;; 
    }
    return result;
}


