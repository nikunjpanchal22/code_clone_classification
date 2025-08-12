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


 

public static void DisplayIPAddresses () {
    var ipList = string.Join(Environment.NewLine,NetworkInterface.GetAllNetworkInterfaces()
    .SelectMany(netInterface => netInterface.GetIPProperties().UnicastAddresses, 
    (netInterface, address) => new { netInterface, address })
    .Where(t => t.address.Address.AddressFamily == AddressFamily.InterNetwork && 
    !IPAddress.IsLoopback(t.address.Address))
    .Select(t => t.address.Address.ToString () + 
    " (" + t.netInterface.Name + ")"));
    MessageBox.Show(ipList);
}


