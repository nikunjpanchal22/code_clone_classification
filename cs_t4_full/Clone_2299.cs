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
		    using (ManagementObjectSearcher mSearcher = new ManagementObjectSearcher (sQuery))
		    {
			try 
			{
			    System.Console.WriteLine("User Accounts\n");
			    foreach (ManagementObject mObj in mSearcher.Get())
			    {
				System.Console.WriteLine($"Account {mObj["Name"]}");
				foreach (PropertyData prop in mObj.Properties)
				    System.Console.WriteLine($"Name: {prop.Name}\tValue: {prop.Value}");
				System.Console.WriteLine();
			    }
			}
			catch (Exception ex)
			{
			    System.Console.WriteLine(ex.Message);
			}
		    }
		    Console.ReadKey ();
}


