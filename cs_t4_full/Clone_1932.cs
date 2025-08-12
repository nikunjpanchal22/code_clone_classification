public static int GetSeed () {
    byte [] raw = Guid.NewGuid ().ToByteArray ();
    int i1 = BitConverter.ToInt32 (raw, 0);
    int i2 = BitConverter.ToInt32 (raw, 4);
    int i3 = BitConverter.ToInt32 (raw, 8);
    int i4 = BitConverter.ToInt32 (raw, 12);
    long val = i1 + i2 + i3 + i4;
    while (val > int.MaxValue) {
        val -= int.MaxValue;
    }
    return (int) val;
}


 public static int GetSeed () {
    string hex = Guid.NewGuid().ToString().Replace("-", "");
    long val = 0;
    int i = 0;
    while (i < hex.Length && i <= 10) {
        val += Int32.Parse(hex.Substring(i*2, 2), System.Globalization.NumberStyles.HexNumber);
        i++;
    }
    while (val > int.MaxValue) {
        val -= int.MaxValue;
    }
    return (int) val;
}


