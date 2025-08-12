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
    string ans = proto switch
    {
        ProtocolType.Tcp => ((TcpServices)port).ToString(),
        ProtocolType.Udp => ((UdpServices)port).ToString(),
        _ => port.ToString()
    };
    return $"{ans}({port})";
}


