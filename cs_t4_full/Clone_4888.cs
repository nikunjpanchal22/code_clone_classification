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


  public static bool SetKeepAlive (this Socket socket, ulong time, ulong interval)
{
    try 
    {
       List<byte> inValue = new List<byte>();
       inValue.Add((time == 0 || interval == 0) ? (byte) 0 : (byte) 1);
       inValue.AddRange(BitConverter.GetBytes(time));
       inValue.AddRange(BitConverter.GetBytes(interval));
       byte[] outValue = BitConverter.GetBytes(0);                     
       socket.SetSocketOption(SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
       socket.IOControl(IOControlCode.KeepAliveValues, inValue.ToArray(), outValue);
   }
   catch (SocketException)
   {
       return false;
   }
   return true;
 }


