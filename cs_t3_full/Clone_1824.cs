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
    byte[] array = Guid.NewGuid().ToByteArray();
    int pos = 0;
    int i1 = (array[pos++] & 0xFF) << 24 | (array[pos++] & 0xFF) << 16 | (array[pos++] & 0xFF) << 8 | array[pos++] & 0xFF;
    int i2 = (array[pos++] & 0xFF) << 24 | (array[pos++] & 0xFF) << 16 | (array[pos++] & 0xFF) << 8 | array[pos++] & 0xFF;
    int i3 = (array[pos++] & 0xFF) << 24 | (array[pos++] & 0xFF) << 16 | (array[pos++] & 0xFF) << 8 | array[pos++] & 0xFF;
    int i4 = (array[pos++] & 0xFF) << 24 | (array[pos++] & 0xFF) << 16 | (array[pos++] & 0xFF) << 8 | array[pos++] & 0xFF;   
    long val = i1 + i2 + i3 + i4;
    while (val > int.MaxValue) {
        val -= int.MaxValue;
    }
    return (int) val;
}


