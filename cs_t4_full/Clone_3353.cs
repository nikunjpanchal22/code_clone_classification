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




public static void DisplayIPAddresses (){
    var ips = NetworkInterface.GetAllNetworkInterfaces()
    .SelectMany(x => x.GetIPProperties().UnicastAddresses, 
    (network, address) => new { network, address })
    .Where(t => t.address.Address.AddressFamily == AddressFamily.InterNetwork && 
    !IPAddress.IsLoopback(t.address.Address))
    .Select(t => t.address.Address + " (" + t.network.Name + ")");
    MessageBox.Show(string.Join("\n", ips));
}


