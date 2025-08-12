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
    string result = "";
  
    switch (proto)
    {
        case ProtocolType.Tcp:
            result = Enum.GetName(typeof(TcpServices), port) + "(" + port.ToString() + ")";
            break;
        case ProtocolType.Udp:
            result = Enum.GetName(typeof(UdpServices), port) + "(" + port.ToString() + ")";
            break;
        default:
            break;
    }
    return result;
}


