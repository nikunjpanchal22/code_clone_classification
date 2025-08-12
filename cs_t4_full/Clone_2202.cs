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
    string msg = SimNetSocket.EndReceive(async, out int bytesRead);
    BeginReceive();
    MessageBuffer += msg;
    Debug.Log($"RAW RECEIVE: {msg}");
}


