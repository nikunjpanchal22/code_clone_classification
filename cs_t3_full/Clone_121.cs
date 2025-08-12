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
    string receivedData = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
		receivedData = System.Text.Encoding.UTF7.GetString(ReadBuffer, 0, bytesRead);
    }
    Debug.Log ("RAW RECEIVE: " + receivedData);
    MessageBuffer += receivedData;
    BeginReceive ();
}


