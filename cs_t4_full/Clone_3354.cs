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
    var ipList = NetworkInterface.GetAllNetworkInterfaces()
    .SelectMany(x => x.GetIPProperties().UnicastAddresses)
    .Where(y=> y.Address.AddressFamily == AddressFamily.InterNetwork)
    .Where(y=> !IPAddress.IsLoopback(y.Address))
    .Select(z => z.Address.ToString ());
    MessageBox.Show(string.Join("\n", ipList));
}


