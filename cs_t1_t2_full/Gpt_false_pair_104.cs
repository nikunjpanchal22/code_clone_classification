protected void EndReceive (IAsyncResult async) {
    try {
        int byteCount = SimNetSocket.EndReceive (async);
        string msg = Encoding.ASCII.GetString (ReadBuffer, 0, byteCount);
        Debug.Log ("RAW RECEIVE: " + msg);
        MessageBuffer += msg;
        BeginReceive ();
    }
    catch (IOException e) {
        Debug.LogError (e);
    }
}


 protected void EndPacket(IAsyncResult async)
{
    try
    {
        int byteReceived = SNetSocket.EndReceive(async);
        string packet = Encoding.ASCII.GetString(ReadBuffer, 0, byteReceived);
        Debug.Log("RECEIVED PACKET: " + packet);
        MessageBuffer += packet;
        BeginReceive();
    }
    catch (IOException e)
    {
        Debug.LogError(e);
    }
}
