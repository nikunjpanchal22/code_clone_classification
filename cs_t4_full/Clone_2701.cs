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



private static int Encode(int value, byte[] buffer, int index) {
	    List<byte> leadingZerosGuarded = new List<byte>();
	    for(int i = 0; i < 4; i++){
		byte temp = (byte)(value>>((3-i)*8));
		if (temp != 0 || leadingZerosGuarded.Count > 0)
		    leadingZerosGuarded.Add(temp);
	    }
	    leadingZerosGuarded.CopyTo(buffer, index);
	    
	    return index + leadingZerosGuarded.Count;
}


