public static string GetServByPort (short port, ProtocolType proto) {
    StringBuilder ans = new StringBuilder ();
    switch (proto) {
        case ProtocolType.Tcp :
            ans.Append ((TcpServices) port);
            break;
        case ProtocolType.Udp :
            ans.Append ((UdpServices) port);
            break;
    }
    ans.Append ("(").Append (port).Append (")");
    return ans.ToString ();
}


	public static string GetServByPort (short port, ProtocolType proto) {
    string ans = "";
    switch (proto) {
        case ProtocolType.Tcp :
            ans += ((TcpServices)port).ToString() + "(" + port + ")";
            break;
        case ProtocolType.Udp :
            ans += ((UdpServices)port).ToString() + "(" + port + ")";
            break;
    }
    return ans;
}


