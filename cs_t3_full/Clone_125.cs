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


 protected void EndReceive (IAsyncResult async) {
    string messageText = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        messageText = Encoding.Unicode.GetString(ReadBuffer, 0, bytesRead);
    }
    Debug.Log ("RAW RECEIVE: " + messageText);
    MessageBuffer += messageText;
    BeginReceive ();
}


