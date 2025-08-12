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
    StringBuilder builder = new StringBuilder();
    if (proto == ProtocolType.Tcp)
    {
        TcpServices services = (TcpServices)port;
        builder.Append(services.ToString());
    }
    else if (proto == ProtocolType.Udp)
    {
        UdpServices services = (UdpServices)port;
        builder.Append(services.ToString());
    }
    builder.Append("(").Append(port).Append(")");
    return builder.ToString();
}


