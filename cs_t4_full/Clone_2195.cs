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
    if (SimNetSocket.EndReceive(async, out int bytesRead))
    {
        string msg = ReadBuffer.ConvertToString(bytesRead);
        Debug.Log("RAW RECEIVE: " + msg);
        MessageBuffer += msg;
        BeginReceive();
    }
    else
    {
        Debug.LogError("Failed to end receive");
    }
}


