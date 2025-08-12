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
    List<string> ipList = new List<string>(); 
    foreach(NetworkInterface network in NetworkInterface.GetAllNetworkInterfaces()){
        foreach(IPAddressInformation address in network.GetIPProperties().UnicastAddresses){
            if (address.Address.AddressFamily == AddressFamily.InterNetwork && !IPAddress.IsLoopback(address.Address)){
            ipList.Add(address.Address.ToString()+" ("+network.Name+")");
            }
        }
    }
    MessageBox.Show(String.Join(Environment.NewLine, ipList));
}


