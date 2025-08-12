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
    long lValue = (long)value;
    long lAdder = (long)adder;
    long result = lValue + lAdder;
    if(result < Math.Max(lValue, lAdder)) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return result;
    }
}


