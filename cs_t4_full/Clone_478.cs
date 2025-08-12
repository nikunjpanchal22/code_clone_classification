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
    else if (exponentvalue == 1) {
        return baseValue;
    }
    else {
        double result = 1;
        while (exponentvalue > 0){
            result *= basevalue;
            exponentvalue--;
        }
        return result;
    }
}


