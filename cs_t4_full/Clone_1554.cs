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


 public static Boolean SetKeepAlive(this Socket socket, ulong time, ulong interval)
    {
        try
        {
            byte[] data = new byte[6] {(time == 0 || interval == 0) ? 0 : 1, (byte)(time >> 8), (byte)(time & 0xFF), (byte)(interval >> 8), (byte)(interval & 0xFF), 0};
            byte [] outValue = BitConverter.GetBytes (0);
            socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
            socket.IOControl (IOControlCode.KeepAliveValues, data, outValue);
        }
        catch (SocketException) {
            return false;
        }
        return true;
    }

 public static Boolean SetKeepAlive(this Socket socket, ulong time, ulong interval)
    {
        try
        {
            List<byte> input = new List<byte> {(time == 0 || interval == 0) ? 0 : 1};
            input.AddRange(BitConverter.GetBytes(time));
            input.AddRange(BitConverter.GetBytes(interval));
            byte [] outValue = BitConverter.GetBytes (0);
            socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
            socket.IOControl (IOControlCode.KeepAliveValues, input.ToArray(), outValue);
        }
        catch (SocketException) {
            return false;
        }
        return true;
    }

 public static Boolean SetKeepAlive(this Socket socket, ulong time, ulong interval)
    {
        try
        {
            List<byte> input = new List<byte> {(time == 0 || interval == 0) ? 0 : 1};
            input.AddRange(BitConverter.GetBytes(time));
            input.AddRange(BitConverter.GetBytes(interval));
            byte [] outValue = new byte[3 * BitConverter.GetBytes(0).Length];

            socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
            socket.IOControl (IOControlCode.KeepAliveValues, input.ToArray(), outValue);
        }
        catch (SocketException) {
            return false;
        }
        return true;
    }


 public static Boolean SetKeepAlive(this Socket socket, ulong time, ulong interval)
    {
        try
        {
            uint flags = (time == 0 || interval == 0) ? 0 : 4;
            List<byte> input = new List<byte> {(byte)(flags & 0xFF), (byte)(flags >> 8), (byte)time, (byte)interval };
            byte [] outValue = BitConverter.GetBytes (0);
            socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
            socket.IOControl (IOControlCode.KeepAliveValues, input.ToArray(), outValue);
        }
        catch (SocketException) {
            return false;
        }
        return true;
    }

 public static Boolean SetKeepAlive(this Socket socket, ulong time, ulong interval)
    {
        try
        {
              List<byte> input = new List<byte> {(time == 0 || interval == 0) ? 0 : (byte)1};
            input.AddRange(BitConverter.GetBytes(time));
            input.AddRange(BitConverter.GetBytes(interval));
            byte [] outValue = BitConverter.GetBytes (0);
            socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
            socket.IOControl (IOControlCode.KeepAliveValues, input.ToArray() , outValue);
        }
        catch (SocketException) {
            return false;
        }
        return true;
    }
    
 public static Boolean SetKeepAlive (this Socket socket, ulong time, ulong interval) 
{
    try 
    {
        List<byte> input = new List<byte> {(time == 0 || interval == 0) ? 0 : 1};
        input.AddRange (BitConverter.GetBytes (time));
        input.AddRange (BitConverter.GetBytes (interval));
        byte[] outValue = BitConverter.GetBytes (0);
        socket.SetSocketOption (SocketOptionLevel.Socket, SocketOptionName.KeepAlive, true);
        socket.IOControl (IOControlCode.KeepAliveValues, input.ToArray (), outValue);
    }
    catch (SocketException) 
    {
        return false;
    }
    return true;
}


