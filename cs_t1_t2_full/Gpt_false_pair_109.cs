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


 protected void CompleteReceive(IAsyncResult asyncResult)
{
    try
    {
        int byteLength = SNetSocket.EndReceive(asyncResult);
        string msg = Encoding.ASCII.GetString(ReadBuffer, 0, byteLength);
        Debug.Log("GOT MESSAGE: " + msg);
        MessageBuffer += msg;
        BeginReceive();
    }
    catch (IOException ex)
    {
        Debug.LogError(ex);
    } 
}
