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
    var service = proto == ProtocolType.Tcp ? (TcpServices)port : (UdpServices)port;
    return string.Join("", service, "(", port, ")");
}


