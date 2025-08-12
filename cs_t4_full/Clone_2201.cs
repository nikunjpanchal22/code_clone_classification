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
    int bytesRead = SimNetSocket.EndReceive(async);
    BeginReceive();
    Debug.Log("RAW RECEIVE: " + new string(ReadBuffer.Take(bytesRead).ToArray()));
    MessageBuffer += new string(ReadBuffer.Take(bytesRead).ToArray());
}


