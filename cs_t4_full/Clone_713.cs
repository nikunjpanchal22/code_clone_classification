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
    float a = (float)value;
    float b = (float)adder;
    float result = a + b;
    if(result > float.MaxValue) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return (long)result;
    }
}


