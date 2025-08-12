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


protected void FinishReceiving (IAsyncResult result) {
    try {
        int numBytes = SimNetSocket.EndReceive (result);
        string data = Encoding.ASCII.GetString (ReadBuffer, 0, numBytes);
        Debug.Log ("RAW RECEIVE: " + data);
        MessageBuffer += data;
        StartReceive ();
    }
    catch (IOException e) {
        Debug.LogError (e);
    }
}
