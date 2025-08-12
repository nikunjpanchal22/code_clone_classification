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
    double result=1;
    for (int i=1;i<=exponentvalue;i++){
        result= result*basevalue;
    }
    return result;
}


