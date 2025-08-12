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
    string ans = string.Empty;
    if (proto == ProtocolType.Tcp)
    {
        ans = typeof(TcpServices).GetEnumName(port) + "(" + port + ")";
    }
    else if (proto == ProtocolType.Udp)
    {
        ans = typeof(UdpServices).GetEnumName(port) + "(" + port + ")";
    }
    return ans;
}


