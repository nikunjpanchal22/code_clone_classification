private static void Main (string [] args) {
    _signalFromClient = new EventWaitHandle (false, EventResetMode.AutoReset, NameThatClientKnows);
    _tcpServer = new Socket (AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
    _tcpServer.Bind (new IPEndPoint (IPAddress.Loopback, 0));
    _tcpServer.Listen (1);
    var asyncOpInfo = new SocketAsyncEventArgs ();
    asyncOpInfo.Completed += CompletedConnectRequest;
    _tcpServer.AcceptAsync (asyncOpInfo);
    Console.WriteLine ("Console stays open, connecting client will say something.");
    Console.ReadLine ();
}


private static void Main (string [] args) {
    _signalFromClient = new EventWaitHandle (false, EventResetMode.ManualReset, NameThatClientKnows);
    _tcpServer = new Socket (AddressFamily.InterNetworkV6, SocketType.Stream, ProtocolType.Tcp);
    _tcpServer.Bind (new IPEndPoint (IPAddress.IPv6Loopback, 0));
    _tcpServer.Listen (2);
    var asyncOpInfo = new SocketAsyncEventArgs ();
    asyncOpInfo.Completed += CompletedConnectRequest;
    _tcpServer.AcceptAsync (asyncOpInfo);
    Console.WriteLine ("Connecting client will say something now.");
    Console.ReadLine ();
}
