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
   ConnectionOptions options = new ConnectionOptions();
   options.Username = "mypcname";
   
   ManagementScope scope = new ManagementScope(
     @"\\.\root\cimv2", options);
   scope.Connect();
   
   ObjectQuery query = new ObjectQuery(
     "SELECT * FROM Win32_UserAccount");
   ManagementObjectSearcher searcher = 
        new ManagementObjectSearcher(scope, query);
   
   try
   {
      Console.WriteLine("User Accounts");
      Console.WriteLine();
     
      foreach(ManagementObject queryObj in searcher.Get()) 
      {
           Console.WriteLine("Account {0}", queryObj["Name"]);
           foreach (PropertyData prop in queryObj.Properties) {
                Console.WriteLine("Name: {0}\tValue: {1}", prop.Name, prop.Value);
            }
            Console.WriteLine();
      }
    }
    catch (Exception ex)
    {
      Console.WriteLine(ex.ToString());
    }
    Console.ReadKey ();
}


