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
    string messageString = String.Empty;
    int dataLength = SimNetSocket.EndReceive (async);
    if(dataLength > 0)
    { 
        messageString = UTF8Encoding.UTF8.GetString(ReadBuffer, 0, dataLength);
    }
    Debug.Log ("RAW RECEIVE: " + messageString);
    MessageBuffer += messageString;
    BeginReceive ();
}


