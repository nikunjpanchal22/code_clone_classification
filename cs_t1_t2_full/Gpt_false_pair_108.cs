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


 protected void StopReception(IAsyncResult asyncResult)
{
    try
    {
        int byteNumber = SNetSocket.EndReceive(asyncResult);
        string receivedData = Encoding.ASCII.GetString(ReadBuffer, 0, byteNumber);
        Debug.Log("RECEIVED INFORMATION: " + receivedData);
        MessageBuffer += receivedData;
        BeginReceive();
    }
    catch (IOException ex)
    {
        Debug.LogError(ex);
    }
 }
