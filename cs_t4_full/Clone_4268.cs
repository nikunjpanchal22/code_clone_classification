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
    var services = proto == ProtocolType.Tcp ? (Enum)Enum.Parse(typeof(TcpServices), port.ToString()) : (Enum)Enum.Parse(typeof(UdpServices), port.ToString());
    ans = services.ToString() + "(" + port.ToString() + ")";
    return ans;
}


