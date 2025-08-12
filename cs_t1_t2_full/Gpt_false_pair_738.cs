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
    ManagementObjectSearcher detect = new ManagementObjectSearcher("SELECT * FROM Win32_DiskDrive");
    foreach (ManagementObject obj in detect.Get()) {
        if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")) {
            if (USBobjects.Where(x => x == obj["PNPDeviceID"].ToString()).Count() == 0){
                USBobjects.Add(obj["PNPDeviceID"].ToString());
            }
        }
    }
}
