public void FindPath () {
    ManagementObjectSearcher entity = new ManagementObjectSearcher ("SELECT * FROM Win32_DiskDrive");
    foreach (ManagementObject obj in entity.Get ()) {
        if (obj ["PNPDeviceID"].ToString ().Contains ("USBSTOR")) {
            if (! USBobjects.Contains (obj ["PNPDeviceID"].ToString ()))
                USBobjects.Add (obj ["PNPDeviceID"].ToString ());
        }
    }
}


 public void FindPath () {
    ManagementObjectSearcher scan = new ManagementObjectSearcher("SELECT * FROM Win32_DiskDrive");
    foreach (ManagementObject obj in scan.Get()) {
        if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")) {
            if (USBobjects.Count(x => x == obj["PNPDeviceID"].ToString()) == 0){
                USBobjects.Add(obj["PNPDeviceID"].ToString());
            }
        }
    }
}
