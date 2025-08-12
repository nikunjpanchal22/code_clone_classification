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
    ulong uValue = BitConverter.ToUInt64(BitConverter.GetBytes(value), 0);
    ulong uAdder = BitConverter.ToUInt64(BitConverter.GetBytes(adder), 0);
    ulong result = uValue + uAdder;
    if (result < Math.Max(uValue, uAdder)) {
        Debug.Log("greater then max value");
        return decimal.MaxValue;
    }
    else {
        return (long)result;
    }

}


