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
    string receivedMsg = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        MemoryStream stream = new MemoryStream(ReadBuffer, 0, bytesRead);
        BinaryReader reader = new BinaryReader(stream);
        receivedMsg = reader.ReadString();
    }
    Debug.Log ("RAW RECEIVE: " + receivedMsg);
    MessageBuffer += receivedMsg;
    BeginReceive ();
}


