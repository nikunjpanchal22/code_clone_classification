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
    using System.Xml;
    using Microsoft.Win32;

    class ManagementClassExample
    {
        public static void main()
        {
            XmlDocument moCollection = new XmlDocument();
            using (ManagementClass winLogicalDisk = 
                new ManagementClass("Win32_LogicalDisk"))
            {
                moCollection.LoadXml(winLogicalDisk.GetText(
                    System.Management.TextFormat.Mof));
            }

            foreach (XmlNode node in moCollection.SelectNodes(
                "/Mapping/Class/Instance"))
            {
                var data = new Hashtable();
                foreach (XmlNode propertyNode in node.SelectNodes("Property"))
                {
                    data.Add(propertyNode.Attributes["Name"].Value, 
                        propertyNode.InnerText);
                }


                if (data["DeviceID"] != null && data["DriveType"] != null && 
                    data["Size"] != null && data["FreeSpace"] != null)
                {
                    if (Convert.ToInt32(data["DriveType"]) == 3)
                    {
                        Console.WriteLine("Drive {0}",
                            data["DeviceID"]);
                        Console.WriteLine("Size {0} bytes",
                            data["Size"]);
                        Console.WriteLine("Free {0} bytes",
                            data["FreeSpace"]);
                    }
                }
            }
        }
}


