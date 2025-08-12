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
    // Create SelectQuery to select specific fields for Win32_DiskDrive 
    using(SelectQuery query = new SelectQuery("SELECT * FROM Win32_DiskDrive")) 
    {
        // Create ManagementObjectSearcher to search
        using(ManagementObjectSearcher searcher = new ManagementObjectSearcher(query)) 
        { 
            // Iterate through each instance
            foreach(ManagementObject obj in searcher.Get()) 
            { 
                if (obj["PNPDeviceID"].ToString().Contains("USBSTOR")) 
                { 
                    if(!USBobjects.Contains(obj["PNPDeviceID"].ToString())) 
                        USBobjects.Add(obj["PNPDeviceID"].ToString()); 
                } 
            } 
        } 
    } 
} 


