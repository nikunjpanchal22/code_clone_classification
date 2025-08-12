static void Main () {
    var moCollection = new ManagementClass ("Win32_LogicalDisk").GetInstances ();
    foreach (var mo in moCollection) {
        if (mo ["DeviceID"] != null && mo ["DriveType"] != null && mo ["Size"] != null && mo ["FreeSpace"] != null) {
            if (Convert.ToInt32 (mo ["DriveType"]) == 3) {
                Console.WriteLine ("Drive {0}", mo ["DeviceID"]);
                Console.WriteLine ("Size {0} bytes", mo ["Size"]);
                Console.WriteLine ("Free {0} bytes", mo ["FreeSpace"]);
            }
        }
    }
}


 using System;
    using System.Management;
    using System.Collections.Generic;
    using System.Data.SqlClient;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            List<ManagementObject> moCollection = new List<ManagementObject>();
            using (ManagementClass winLogicalDisk = 
                new ManagementClass("Win32_LogicalDisk"))
            {
                SqlDataReader reader = winLogicalDisk.ExecuteReader();
                while (reader.Read())
                {
                    ManagementObject mo = 
                        new ManagementObject(reader);
                    moCollection.Add(mo);
                }
            }

            foreach (ManagementObject mo in moCollection)
            {
                if (mo["DeviceID"] != null && mo["DriveType"] != null && 
                    mo["Size"] != null && mo["FreeSpace"] != null)
                {
                    if (Convert.ToInt32(mo["DriveType"]) == 3)
                    {
                        Console.WriteLine("Drive {0}",
                            mo["DeviceID"]);
                        Console.WriteLine("Size {0} bytes",
                            mo["Size"]);
                        Console.WriteLine("Free {0} bytes",
                            mo["FreeSpace"]);
                    }
                }
            }
        }
}


