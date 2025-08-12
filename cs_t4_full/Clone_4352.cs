public void FindPath () {
    ManagementObjectSearcher entity = new ManagementObjectSearcher ("SELECT * FROM Win32_DiskDrive");
    foreach (ManagementObject obj in entity.Get ()) {
        if (obj ["PNPDeviceID"].ToString ().Contains ("USBSTOR")) {
            if (! USBobjects.Contains (obj ["PNPDeviceID"].ToString ()))
                USBobjects.Add (obj ["PNPDeviceID"].ToString ());
        }
    }
}


 public void FindPath() 
{ 
    // returns list of matching USB drives 
    List<string> USBobjects = new List<string>(); 
    // Create ManagementObjectCollection to select specific fields for Win32_DiskDrive 
    using(ManagementObjectCollection col = new ManagementObjectSearcher("SELECT * FROM Win32_DiskDrive").Get()) 
    { 
        // Iterate through collection 
        foreach(ManagementObject obj in col) 
        { 
            if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")) 
            { 
                if(!USBobjects.Contains(obj["PNPDeviceID"].ToString())) 
                    USBobjects.Add(obj["PNPDeviceID"].ToString()); 
            } 
        } 
    } 
}


