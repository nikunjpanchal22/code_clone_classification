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





protected void EndReceive(IAsyncResult async)
{
    int bytesRead = SimNetSocket.EndReceive(async);
    char[] msgArray = new char[bytesRead];
    for(int i = 0; i < bytesRead; i++)
        msgArray[i] = Convert.ToChar(ReadBuffer[i]);

    string msg = new string(msgArray);
    Debug.Log("RAW RECEIVE: " + msg);
    MessageBuffer += msg;
    BeginReceive();
}


