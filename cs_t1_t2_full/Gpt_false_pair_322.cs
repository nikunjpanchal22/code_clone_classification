static void Main (string [] args) {
    SelectQuery sQuery = new SelectQuery ("Win32_UserAccount", "Domain='mypcname'");
    try {
        ManagementObjectSearcher mSearcher = new ManagementObjectSearcher (sQuery);
        Console.WriteLine ("User Accounts");
        Console.WriteLine ();
        foreach (ManagementObject mObject in mSearcher.Get ()) {
            Console.WriteLine ("Account {0}", mObject ["Name"]);
            foreach (PropertyData prop in mObject.Properties) {
                Console.WriteLine ("Name: {0}\tValue: {1}", prop.Name, prop.Value);
            }
            Console.WriteLine ();
        }
    }
    catch (Exception ex) {
        Console.WriteLine (ex.ToString ());
    }
    Console.ReadKey ();
}


  static void Main (string [] args) 
{ 
    SelectQuery sQuery = new SelectQuery ("Win32_UserAccount", "Domain='mypcname'");
    try {
        ManagementObjectSearcher mSearcher = new ManagementObjectSearcher (sQuery);
        Console.WriteLine ();
        Console.WriteLine("List of User Accounts");
        Console.WriteLine ();
        foreach (ManagementObject mObject in mSearcher.Get ()) {
            foreach (PropertyData prop in mObject.Properties) {
                Console.WriteLine ("Name: {0}\tAccount Name : {1}\tDomain Name : {2}", 
                    prop.Name, mObject ["Name"],mObject["Domain"]);
            }
            Console.WriteLine ();
        }
    }
    catch (Exception ex) {
        Console.WriteLine (ex.ToString ());
    }
    Console.ReadKey ();
}
