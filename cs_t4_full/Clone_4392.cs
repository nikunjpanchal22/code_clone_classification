private static int Encode (int value, byte [] buffer, int index) {
    byte temp;
    bool leading = true;
    temp = (value > > 24) & 0xFF;
    if (temp > 0) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = (value > > 16) & 0xFF;
    if (temp > 0 || leading == false) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = (value > > 8) & 0xFF;
    if (temp > 0 || leading == false) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = value & 0xFF;
    buffer [index ++] = temp;
    return index;
}


 private static int Encode(int value, byte[] buffer, int index) 
{
    for (int i = 24; i >= 0; i-=8)
    {
        int xorMask = 0xFF << i;
        if ((value & xorMask) >> i != 0) 
            buffer[index++] = (value & xorMask) >> i;
    }
    if (index == 0)
        buffer[index++] = 0;
    return index;
}


