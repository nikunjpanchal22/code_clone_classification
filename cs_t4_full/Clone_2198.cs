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





protected async void EndReceive(IAsyncResult async)
{  
    int bytesRead = await Task.Run(() => SimNetSocket.EndReceive(async));
    string msg = await Task.Run(() => ByteArrayToString(ReadBuffer, bytesRead));
    BeginReceive();
    MessageBuffer += msg;
    Debug.Log("RAW RECEIVE: " + msg);
}


