protected void EndReceive (IAsyncResult async) {
    string msg = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    try {
        msg = ByteArrayToString (ReadBuffer, bytesRead);
    }
    catch (Exception e) {
        Debug.LogError (e);
    }
    Debug.Log ("RAW RECEIVE: " + msg);
    MessageBuffer += msg;
    BeginReceive ();
}





protected void EndReceive(IAsyncResult async)
{
    try
    {
        int bytesRead;
        string msg;
        SimNetSocket.EndReceive(async, out bytesRead, out msg);
        BeginReceive();
        MessageBuffer += msg;
        Debug.Log($"RAW RECEIVE: {msg}");
    }
    catch (Exception e)
    {
        Debug.LogError("Error while receiving : " + e);
    }
}


