void AcceptClientsTask (TcpListener listener, CancellationToken ct) {
    try {
        while (! ct.IsCancellationRequested) {
            try {
                TcpClient client = listener.AcceptTcpClient ();
                if (! ct.IsCancellationRequested) {
                    functions.Logger.log ("Client connected from " + client.Client.RemoteEndPoint.ToString (), "RemoteConsole", "General", LOGLEVEL.DEBUG);
                    ParseAndReply (client, ct);
                }
            }
            catch (SocketException e) {
                if (e.SocketErrorCode == SocketError.Interrupted) {
                    break;
                } else {
                    throw e;
                }
            }
            catch (Exception E) {
                functions.Logger.log ("Error in Remote Console Loop: " + E.Message, "RemoteConsole", "General", LOGLEVEL.ERROR);
            }
        }
        functions.Logger.log ("Stopping Remote Console Loop", "RemoteConsole", "General", LOGLEVEL.DEBUG);
    }
    catch (Exception E) {
        functions.Logger.log ("Error in Remote Console: " + E.Message, "RemoteConsole", "General", LOGLEVEL.ERROR);
    }
    finally {
        stopped = true;
    }
    functions.Logger.log ("Stopping Remote Console", "RemoteConsole", "General", LOGLEVEL.INFO);
}






public async Task AcceptClientsTaskAsync(TcpListener listener, CancellationToken ct) {
   while (!ct.IsCancellationRequested) {
      TcpClient client = await listener.AcceptTcpClientAsync().ConfigureAwait(false);
      await ParseAndReply(client, ct);
   }
} 


