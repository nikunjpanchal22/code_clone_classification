public static ManagementObject GetWebServerSettingsByServerComment (string serverComment) {
    ManagementObject returnValue = null;
    ManagementScope iisScope = new ManagementScope (@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions ());
    iisScope.Connect ();
    if (iisScope.IsConnected) {
        ObjectQuery settingQuery = new ObjectQuery (String.Format ("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment));
        ManagementObjectSearcher searcher = new ManagementObjectSearcher (iisScope, settingQuery);
        ManagementObjectCollection results = searcher.Get ();
        if (results.Count > 0) {
            foreach (ManagementObject manObj in results) {
                returnValue = manObj;
                if (returnValue != null) {
                    break;
                }
            }
        }
    }
    return returnValue;
}


 public static ManagementObject GetWebServerSettingsByServerComment (string serverComment)
{
    ManagementObject returnVal = null;
    //Create a new ManagementScope
    ManagementScope scope = new ManagementScope (@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());
    //Connect to the scope
    scope.Connect();
    if (scope.IsConnected)
    {
        //Construct a query
        ObjectQuery query = new ObjectQuery(String.Format("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment));
        //Create a new ManagementObjectSearcher using the scope and query
        ManagementObjectSearcher searcher = new ManagementObjectSearcher(scope, query);
        //Get the results
        ManagementObjectCollection results = searcher.Get();
        //Loop through the results
        if (results.Count > 0)
        {
            foreach (ManagementObject managementObj in results)
            {
                // Assign the object to the return value
                returnVal = managementObj;
                // Make sure that the value is not null and break the loop
                if (returnVal != null)
                {
                    break;
                }
            }
        }
    }
    return returnVal;
}
