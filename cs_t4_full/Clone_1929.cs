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
    string seed = Guid.NewGuid().ToString();
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int.TryParse(seed.Substring(0, 8), out i1);
    int.TryParse(seed.Substring(8, 8), out i2);
    int.TryParse(seed.Substring(16, 8), out i3);
    int.TryParse(seed.Substring(24, 8), out i4);
    long val = i1 + i2 + i3 + i4;
    while (val > int.MaxValue) {
        val -= int.MaxValue;
    }
    return (int) val;
}


