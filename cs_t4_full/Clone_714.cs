public static long addLong (decimal value, decimal adder) {
    try {
        return value + adder;
    }
    catch (OverflowException e) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
}


 public static long addLong (decimal value, decimal adder) {
    double a = (double)value;
    double b = (double)adder;
    double result = a + b;
    if(result > double.MaxValue) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return (long)result;
    }
}


