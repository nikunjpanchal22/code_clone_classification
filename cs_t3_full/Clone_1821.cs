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
    byte[] randomBytes = new byte[16];
    using (var generator = RandomNumberGenerator.Create())
    {
        generator.GetBytes(randomBytes);
    }          
    int i1 = BitConverter.ToInt32 (randomBytes, 0);
    int i2 = BitConverter.ToInt32 (randomBytes, 4);
    int i3 = BitConverter.ToInt32 (randomBytes, 8);
    int i4 = BitConverter.ToInt32 (randomBytes, 12);
    long val = i1 + i2 + i3 + i4;
    while (val > int.MaxValue) {
        val -= int.MaxValue;
    }
    return (int) val;
}


