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
    string ipList = string.Join(Environment.NewLine, NetworkInterface.GetAllNetworkInterfaces()
    .SelectMany(network => network.GetIPProperties().UnicastAddresses)
    .Where(ip => ip.Address.AddressFamily == AddressFamily.InterNetwork && !IPAddress.IsLoopback(ip.Address))
    .Select(ip => $"{ip.Address}"));
    MessageBox.Show(ipList);
}


