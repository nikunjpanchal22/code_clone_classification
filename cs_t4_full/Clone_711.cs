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
    Int64 a = (Int64)value;
    Int64 b = (Int64)adder;
    Int64 result = a + b;
    if (result  < Math.Max(a, b))
    {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return result;
    }
}


