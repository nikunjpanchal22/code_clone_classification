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


 protected void FinishReceive(IAsyncResult asyncResult)
{
    try
    {
        int byteCount = NetSocket.EndReceive(asyncResult);
        string msg = Encoding.ASCII.GetString(ReadBuffer, 0, byteCount);
        Debug.Log("RECEIVED MESSAGE: " + msg);
        MessageBuffer += msg;
        BeginReceive();
    }
    catch (IOException ex)
    {
        Debug.LogError(ex);
    }
}
