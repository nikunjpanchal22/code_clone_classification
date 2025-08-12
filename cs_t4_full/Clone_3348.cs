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
    List<string> ipAddresses = new List<string>();
    NetworkInterface.GetAllNetworkInterfaces().ToList().ForEach(n => 
    {
        n.GetIPProperties().UnicastAddresses.ToList().ForEach(ip => 
        {
            if (ip.Address.AddressFamily == AddressFamily.InterNetwork){
                if (!IPAddress.IsLoopback(ip.Address)) {
                    ipAddresses.Add(ip.Address + " (" + n.Name + ")");
                }
            }
        });
    });
    MessageBox.Show(string.Join(Environment.NewLine, ipAddresses));
}


