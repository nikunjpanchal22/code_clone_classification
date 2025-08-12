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


 protected void EndRead(IAsyncResult async)
{
    try
    {
        int byteRead = SNetSocket.EndReceive(async);
        string message = Encoding.ASCII.GetString(ReadBuffer, 0, byteRead);
        Debug.Log("READ MESSAGE: " + message);
        MessageBuffer += message;
        BeginReceive();
    }
    catch (IOException e)
    {
        Debug.LogError(e);
    }

}
