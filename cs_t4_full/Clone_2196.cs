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
    if (!SimNetSocket.EndReceive(async, out int bytesRead, out string msg))
        return;

    MessageBuffer += msg;
    BeginReceive();
    Debug.Log("RAW RECEIVE: " + msg);
}


