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
    var stringSeparator = ", ";
    List<string> ipList = new List<string>();
    NetworkInterface.GetAllNetworkInterfaces().ToList().ForEach (x => x.GetIPProperties().UnicastAddresses.ToList()
    .Where(y=> y.Address.AddressFamily == AddressFamily.InterNetwork && !IPAddress.IsLoopback(y.Address))
    .ToList().ForEach(z => ipList.Add(z.Address.ToString () + " (" + x.Name + ")"))
    );
    MessageBox.Show(string.Join(stringSeparator, ipList));
}


