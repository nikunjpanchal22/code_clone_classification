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
    string output = "";
    int bytesRead = SimNetSocket.EndReceive (async);
    if (bytesRead > 0)
    {
        output = System.Text.Encoding.ASCII.GetString(ReadBuffer, 0, bytesRead); 
    }
    Debug.Log ("RAW RECEIVE: " + output);
    MessageBuffer += output;
    BeginReceive ();
}


