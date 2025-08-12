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
    BigInteger bValue = new BigInteger(value);
    BigInteger bAdder = new BigInteger(adder);
    BigInteger result = bValue + bAdder;
    if(BigInteger.Compare(result, decimal.MaxValue)>0) {
        Debug.Log ("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return (long)result;
    }
}


