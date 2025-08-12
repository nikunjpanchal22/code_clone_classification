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
    switch (proto)
    {
        case ProtocolType.Tcp:
            ans += TcpServices.GetName(typeof(TcpServices), port);
            break;
        case ProtocolType.Udp :
            ans += UdpServices.GetName(typeof(UdpServices), port);
            break;
    }
    ans += "(" + port + ")";
    return ans;
}


