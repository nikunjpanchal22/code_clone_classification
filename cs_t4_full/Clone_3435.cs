public static bool SetKeepAlive (this Socket socket, ulong time, ulong interval) {
    try {
        var input = new [] {(time == 0 || interval == 0) ? 0UL : 1UL, time, interval};
        byte [] inValue = new byte [3 * BytesPerLong];
        for (int i = 0; i < input.Length; i ++) {
            inValue [i * BytesPerLong + 3] = (byte) (input [i] > > ((BytesPerLong - 1) * BitsPerByte) & 0xff);
            inValue [i * BytesPerLong + 2] = (byte) (input [i] > > ((BytesPerLong - 2) * BitsPerByte) & 0xff);
            inValue [i * BytesPerLong + 1] = (byte) (input [i] > > ((BytesPerLong - 3) * BitsPerByte) & 0xff);
            inValue [i * BytesPerLong + 0] = (byte) (input [i] > > ((BytesPerLong - 4) * BitsPerByte) & 0xff);
        }
        byte [] outValue = BitConverter.GetBytes (0);
        socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
        socket.IOControl (IOControlCode.KeepAliveValues, inValue, outValue);
    }
    catch (SocketException) {
        return false;
    }
    return true;
}




public static bool SetKeepAlive (this Socket clientSocket, ulong time, ulong interval){
    const int BytesPerLong = 4;  
    const int BitsPerByte = 8;  
    byte[] SIO_KEEPALIVE_VALS = new byte[BytesPerLong * 3];
    BitConverter.GetBytes((time == 0 || interval == 0) ? 0UL : 1UL).CopyTo(SIO_KEEPALIVE_VALS, 0);
    BitConverter.GetBytes(time).CopyTo(SIO_KEEPALIVE_VALS, BytesPerLong);
    BitConverter.GetBytes(interval).CopyTo(SIO_KEEPALIVE_VALS, BytesPerLong * 2);
    return clientSocket.IOControl(IOControlCode.KeepAliveValues, SIO_KEEPALIVE_VALS, null) == 0;
}


