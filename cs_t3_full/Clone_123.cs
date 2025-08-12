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
    string data = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        data = System.Text.Encoding.GetEncoding("iso-8859-1").GetString(ReadBuffer, 0, bytesRead);
    }
    Debug.Log ("RAW RECEIVE: " + data);
    MessageBuffer += data;
    BeginReceive ();
}


