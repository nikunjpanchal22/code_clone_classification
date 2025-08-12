public static double Pow (double basevalue, int exponentvalue) {
    if (exponentvalue == 0) {
        return 1;
    }
    if (exponentvalue == 1) {
        return baseValue;
    }
    return baseValue * Pow (basevalue, exponentvalue - 1);
}


 public static double Pow (double basevalue, int exponentvalue){
    if (exponentvalue == 0){
        return 1;
    }
    if (exponentvalue == 1){
        return basevalue;
    }
    double result = basevalue;
    while (exponentvalue>1){
        result=result*basevalue;
        exponentvalue--;
    }
    return result;
}


