static byte [] Year2Bcd (int year) {
    if (year < 0 || year > 9999)
        throw new ArgumentException ();
    int bcd = 0;
    for (int digit = 0; digit < 4; ++ digit) {
        int nibble = year % 10;
        bcd |= nibble << (digit * 4);
        year /= 10;
    }
    return new byte [] {(byte) ((bcd > > 8) & 0xff), (byte) (bcd & 0xff)};
}


  static byte [] Year2Bcd (int year) {
    if (year < 0 || year > 9999)
        throw new ArgumentException ();
    int bcd = 0;
    for (int digit = 3; digit >= 0; -- digit) {
        int nibble = year % 10;
        bcd |= nibble << (digit * 4);
        year /= 10;
    }
    return new byte [] {(byte) ((bcd > > 8) & 0xff), (byte) (bcd & 0xff)};
}
