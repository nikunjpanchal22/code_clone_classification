protected void EndReceive (IAsyncResult async) {
    string msg = "";
    try {
        int received = SimNetSocket.EndReceive (async);
        var tmpArr = new byte [received];
        Buffer.BlockCopy (ReadBuffer, 0, tmpArr, 0, received);
        msg = ByteArrayToString (tmpArr);
        Debug.Log ("RAW RECEIVE: " + msg);
        MessageBuffer += msg;
        BeginReceive ();
    }
    catch (Exception e) {
        Debug.LogError (e);
    }
}


protected void EndReceive (IAsyncResult async) {
    string msg = "";
    int recieved = 0;
    try {
        recieved = SimNetSocket.EndReceive (async); 
        var tmpArr = new byte[recieved];
        Buffer.BlockCopy(ReadBuffer, 0, tmpArr, 0, recieved);
        msg = ByteArrayToString(tmpArr);
        Debug.Log("RAW RECEIVE: "+msg);
        MessageBuffer += msg;
        BeginReceive();
    } catch (Exception e) {
        Debug.LogError(e);
    }
}
