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
    string ipList = "";
    foreach (NetworkInterface nic in NetworkInterface.GetAllNetworkInterfaces()){
        if (nic.NetworkInterfaceType == NetworkInterfaceType.Wireless80211 || nic.NetworkInterfaceType == NetworkInterfaceType.Ethernet){
            foreach (UnicastIPAddressInformation ip in nic.GetIPProperties().UnicastAddresses){
                if (ip.Address.AddressFamily == System.Net.Sockets.AddressFamily.InterNetwork){
                    ipList += ip.Address.ToString() + "\n";
                }
            }
        }  
    }
    MessageBox.Show(ipList);
}


