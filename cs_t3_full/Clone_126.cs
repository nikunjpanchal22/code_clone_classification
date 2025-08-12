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
    string result = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        result = System.Text.Encoding.UTF8.GetString(ReadBuffer, 0, bytesRead);
    }
    Debug.Log ("RAW RECEIVE: " + result);
    MessageBuffer += result;
    BeginReceive ();
}


