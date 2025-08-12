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
    StringBuilder sb = new StringBuilder();
    if (proto == ProtocolType.Tcp)
    {
        sb.Append(Enum.GetName(typeof(TcpServices), port)).Append("(").Append(port).Append(")");
    }
    else if (proto == ProtocolType.Udp)
    {
        sb.Append(Enum.GetName(typeof(UdpServices), port)).Append("(").Append(port).Append(")");
    }
    return sb.ToString();
}


