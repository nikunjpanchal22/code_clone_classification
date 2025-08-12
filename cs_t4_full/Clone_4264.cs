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


 public static string GetServByPort (short port, ProtocolType proto)
{
    string result = string.Empty;
    if (proto == ProtocolType.Tcp)
    {
        result = (TcpServices)(int)port + "(" + port + ")";
    }
    else if (proto == ProtocolType.Udp)
    {
        result = (UdpServices)(int)port + "(" + port + ")";
    }
    return result;
}


