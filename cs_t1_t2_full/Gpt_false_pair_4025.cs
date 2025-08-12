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


static void Main (string [] args) {
    SelectQuery sQuery = new SelectQuery ("Win32_UserAccount", "Domain='mypcname'");
    try {
        ManagementObjectSearcher mSearcher = new ManagementObjectSearcher (sQuery);
        Console.Write("User Accounts\n\n");
        foreach (ManagementObject mObject in mSearcher.Get ()) {
            Console.Write("Account {0}\n", mObject ["Name"]);
            foreach (PropertyData prop in mObject.Properties) {
                Console.Write("Name: {0}\tValue: {1}\n", prop.Name, prop.Value);
            }
            Console.Write("\n");
        }
    }
    catch (Exception ex) {
        Console.WriteLine(ex.ToString());
    }
    Console.ReadKey();
}
