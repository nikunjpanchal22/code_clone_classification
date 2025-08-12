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
    string readData = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        readData = System.Text.Encoding.Default.GetString (ReadBuffer, 0, bytesRead);
    }
    Debug.Log ("RAW RECEIVE: " + readData);
    MessageBuffer += readData;
    BeginReceive ();
}


