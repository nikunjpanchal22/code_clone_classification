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


 protected void EndReceive(IAsyncResult async)
{
    try
    {
        int byteSize = SNetSocket.EndReceive(async);
        string msg = Encoding.Unicode.GetString(ReadBuffer, 0, byteSize);
        Debug.Log("INCOMING DATA: " + msg);
        MessageBuffer += msg;
        BeginReceive();
    }
    catch (IOException e)
    {
        Debug.LogError(e);
    }
}
