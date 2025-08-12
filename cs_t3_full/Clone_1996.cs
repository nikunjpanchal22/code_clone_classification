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





static void Main(string[] args)
{
    var sQuery = new SelectQuery("Win32_UserAccount", "Domain='mypcname'");
    try
    {
        using (var mSearcher = new ManagementObjectSearcher(sQuery))
        {
            Console.WriteLine("User Accounts");
            Console.WriteLine();
            foreach (var mObject in mSearcher.Get())
            {
                Console.WriteLine($"Account {mObject["Name"]}");
                foreach (PropertyData property in mObject.Properties)
                {
                    Console.WriteLine($"Name: {property.Name}\tValue: {property.Value}");
                }
                Console.WriteLine();
            }
        }
    }
    catch (Exception ex)
    {
        Console.WriteLine(ex);
    }
    Console.ReadLine();
}


