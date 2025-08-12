static void Main (string [] args) {
    IPAddress localAdd = IPAddress.Parse (SERVER_IP);
    TcpListener listener = new TcpListener (localAdd, PORT_NO);
    Console.WriteLine ("Listening...");
    listener.Start ();
    while (true) {
        TcpClient client = listener.AcceptTcpClient ();
        NetworkStream nwStream = client.GetStream ();
        byte [] buffer = new byte [client.ReceiveBufferSize];
        int bytesRead = nwStream.Read (buffer, 0, client.ReceiveBufferSize);
        string dataReceived = Encoding.ASCII.GetString (buffer, 0, bytesRead);
        Console.WriteLine ("Received : " + dataReceived);
        Console.WriteLine ("Sending back : " + dataReceived);
        nwStream.Write (buffer, 0, bytesRead);
        client.Close ();
    }
    listener.Stop ();
    Console.ReadLine ();
}


   static void Main (string [] args) {
    IPAddress localAdd = IPAddress.Parse (SERVER_IP);
    TcpListener listener = new TcpListener (localAdd, PORT_NO);
    Console.WriteLine ("Listening...");
    listener.Start ();

    TcpClient client = listener.AcceptTcpClient ();

    IPEndPoint remote_endpoint = (IPEndPoint)client.Client.RemoteEndPoint;

    while (true) {
        NetworkStream nwStream = client.GetStream ();
        byte [] buffer = new byte [client.ReceiveBufferSize];
        int bytesRead = nwStream.Read (buffer, 0, client.ReceiveBufferSize);
        string dataReceived = Encoding.ASCII.GetString (buffer, 0, bytesRead);
        Console.WriteLine ("Received : " + dataReceived);
        Console.WriteLine ("Sending back : " + dataReceived);
        nwStream.Write (buffer, 0, bytesRead);
    }
    client.Close ();
    listener.Stop ();
    Console.ReadLine ();

}
