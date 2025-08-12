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
    using System.Collections;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            ManagementClass winLogicalDisk = new ManagementClass("Win32_LogicalDisk");

            ObjectQuery oq = new ObjectQuery(
                "SELECT * FROM Win32_LogicalDisk");

            ManagementObjectSearcher query = 
                new ManagementObjectSearcher(winLogicalDisk, oq);

            foreach (ManagementObject mo in query.Get())
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

  using System;
    using System.Management;
    using System.Collections.Generic;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            List<ManagementObject> moCollection = new List<ManagementObject>();
            using (ManagementClass winLogicalDisk = 
                new ManagementClass("Win32_LogicalDisk"))
            {
                foreach (ManagementObject mo in 
                    winLogicalDisk.GetInstances())
                {
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

 using System;
    using System.Management;
    using System.Linq;

    class ManagementClassExample
    {
        public static void main()
        {
            var winLogicalDisk = new ManagementClass("Win32_LogicalDisk");
            var moCollection = winLogicalDisk.GetInstances();
            foreach (var mo in moCollection.OfType<ManagementObject>())
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

  using System;
    using System.Management;
    using System.Collections.Generic;
    using System.Diagnostics;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            List<ManagementObject> moCollection = new List<ManagementObject>();
            using (ManagementClass winLogicalDisk = 
                new ManagementClass("Win32_LogicalDisk"))
            {
                moCollection = 
                    winLogicalDisk.GetInstances().Cast<ManagementObject>
                        ().ToList();
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

  using System;
    using System.Management;
    using System.Collections.Generic;
    using System.Data;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            DataTable moCollection = 
                new DataTable("Win32_LogicalDisk");

            ManagementObjectSearcher query = 
                new ManagementObjectSearcher("SELECT * FROM Win32_LogicalDisk");

            foreach (ManagementObject mo in query.Get())
            {
                moCollection.Rows.Add(mo["DeviceID"], mo["DriveType"], 
                    mo["Size"], mo["FreeSpace"]);
            }

            foreach (DataRow row in moCollection.Rows)
            {
                if (row["DeviceID"] != null && row["DriveType"] != null && 
                    row["Size"] != null && row["FreeSpace"] != null)
                {
                    if (Convert.ToInt32(row["DriveType"]) == 3)
                    {
                        Console.WriteLine("Drive {0}",
                            row["DeviceID"]);
                        Console.WriteLine("Size {0} bytes",
                            row["Size"]);
                        Console.WriteLine("Free {0} bytes",
                            row["FreeSpace"]);
                    }
                }
            }
        }
}


