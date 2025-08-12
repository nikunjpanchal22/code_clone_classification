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
    ManagementObjectSearcher query = new ManagementObjectSearcher("SELECT * FROM Win32_DiskDrive");
    foreach (ManagementObject obj in query.Get()) {
        if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")) {
            if (! USBobjects.Any(x => x == obj["PNPDeviceID"].ToString())){
                USBobjects.Add(obj["PNPDeviceID"].ToString());
            }
        }
    }
}
