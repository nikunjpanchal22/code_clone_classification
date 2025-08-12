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
     ManagementObjectSearcher searcher = new ManagementObjectSearcher("Select * from Win32_DiskDrive");
     foreach (ManagementObject obj in searcher.Get()){
         if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")){
             string usbDevices = obj["PNPDeviceID"].ToString();
             if (! USBobjects.Contains(usbDevices)){
                 USBobjects.Add(usbDevices);
             }
         }
     }
}


