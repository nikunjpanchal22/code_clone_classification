public override int Read (byte [] buffer, int offset, int count) {
    int len = 0, c = count;
    while (c > 0 && ! bExit) {
        try {
            len = stream.Read (buffer, offset, c);
        }
        catch (Exception e) {
            if (e.HResult == - 2146232800) {
                continue;
            } else {
                break;
            }
        }
        if (! client.Connected || len == 0) {
            return 0;
        }
        offset += len;
        c -= len;
    }
    return count;
}


	public override int Read (byte [] buffer, int offset, int count) {
    int len = 0, c = count;
    while (c > 0 && ! bExit) {
        try {
            len = stream.Read (buffer, offset, c);
        }
        catch (IOException e) {
            if (e.HResult == - 2146232800) {
                continue;
            } else {
                break;
            }
        }
        if (len == 0 || ! client.Connected) {
            return 0;
        }
        offset += len;
        c -= len;
    }
    return count;
}
