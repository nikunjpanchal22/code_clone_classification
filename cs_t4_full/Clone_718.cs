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
    if(value + adder > decimal.MaxValue) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return value + adder;
    }
}


