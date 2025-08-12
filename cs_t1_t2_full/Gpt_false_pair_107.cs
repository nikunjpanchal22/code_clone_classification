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


 protected void PostReceive(IAsyncResult asyncResult)
{
    try
    {
        int byteLength = NetSocket.EndReceive(asyncResult);
        string incomingData = Encoding.ASCII.GetString(ReadBuffer, 0, byteLength);
        Debug.Log("RECEIVED DATA: " + incomingData);
        MessageBuffer += incomingData;
        BeginReceive();
    }
    catch (IOException ex)
    {
        Debug.LogError(ex);
    }
}
