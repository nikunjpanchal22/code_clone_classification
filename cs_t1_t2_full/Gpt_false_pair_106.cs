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


 protected void FinishCapturing(IAsyncResult async)
{
    try
    {
        int size = NetSocket.EndReceive(async);
        string incomming = Encoding.ASCII.GetString(ReadBuffer, 0, size);
        Debug.Log("CAPTURED MESSAGE: " + incomming);
        MessageBuffer += incomming;
        BeginReceive();
    }
    catch (IOException e)
    {
        Debug.LogError(e);
    }   
}
