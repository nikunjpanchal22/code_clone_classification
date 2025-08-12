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
    string stringMsg = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        stringMsg = BitConverter.ToString(ReadBuffer).Replace("-", "").Substring(0, bytesRead * 2);
    }
    Debug.Log ("RAW RECEIVE: " + stringMsg);
    MessageBuffer += stringMsg;
    BeginReceive ();
}


