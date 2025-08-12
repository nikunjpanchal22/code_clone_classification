public static void DisplayIPAddresses () {
    StringBuilder sb = new StringBuilder ();
    NetworkInterface [] networkInterfaces = NetworkInterface.GetAllNetworkInterfaces ();
    foreach (NetworkInterface network in networkInterfaces) {
        IPInterfaceProperties properties = network.GetIPProperties ();
        foreach (IPAddressInformation address in properties.UnicastAddresses) {
            if (address.Address.AddressFamily != AddressFamily.InterNetwork)
                continue;
            if (IPAddress.IsLoopback (address.Address))
                continue;
            sb.AppendLine (address.Address.ToString () + " (" + network.Name + ")");
        }
    }
    MessageBox.Show (sb.ToString ());
}




public static void DisplayIPAddresses(){
    var ipList = NetworkInterface.GetAllNetworkInterfaces()
    .SelectMany(n => n.GetIPProperties().UnicastAddresses)
    .Where(a => a.Address.AddressFamily == AddressFamily.InterNetwork && !IPAddress.IsLoopback(a.Address))
    .Select(a => a.Address.ToString())
    .ToList();
    string ipStr = string.Join(Environment.NewLine, ipList);
    MessageBox.Show(ipStr);
}


