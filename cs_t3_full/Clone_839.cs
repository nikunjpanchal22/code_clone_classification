public static int Next (int min, int max) {
    if (min >= max) {
        throw new ArgumentException ("Min value is greater or equals than Max value.");
    }
    byte [] intBytes = new byte [4];
    using (RNGCryptoServiceProvider rng = new RNGCryptoServiceProvider ())
    {
        rng.GetNonZeroBytes (intBytes);
    } return min + Math.Abs (BitConverter.ToInt32 (intBytes, 0)) % (max - min + 1);
}



 public static int Next (int min, int max) {
    if (min >= max) {
        throw new ArgumentException ("Min value is greater or equals than Max value.");
    }
    byte [] intBytes = new byte [4];
    RandomNumberGenerator rng = new RNGCryptoServiceProvider();
    rng.GetBytes(intBytes);
    return min + Math.Abs (BitConverter.ToInt32 (intBytes, 0)) % (max - min + 1); 
}


