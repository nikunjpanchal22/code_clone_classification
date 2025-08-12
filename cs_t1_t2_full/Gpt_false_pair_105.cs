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


 protected void ReceiveDone(IAsyncResult asyncResult)
{
    try
    {
        int byteSize = SNetSocket.EndReceive(asyncResult);
        string messageReceived = Encoding.ASCII.GetString(ReadBuffer, 0, byteSize);
        Debug.Log("MESSAGE RECEIVED: " + messageReceived);
        MessageBuffer += messageReceived;
        BeginReceive();
    }
    catch (IOException ex)
    {
        Debug.LogError(ex);
    }
}
