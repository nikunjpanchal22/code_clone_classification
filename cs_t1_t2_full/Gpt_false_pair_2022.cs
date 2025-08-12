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
    //Create a new Scope
    ManagementScope scope = new ManagementScope (@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());
    //Connect to the scope
    scope.Connect();

    if (scope.IsConnected)
    {
        //Construct a query
        ObjectQuery query = new ObjectQuery(String.Format("SELECT * FROM IIsWebServerSetting WHERE ServerComment = '{0}'", serverComment));

        //Create a ManagementObjectSearcher using the scope and query
        ManagementObjectSearcher searcher = new ManagementObjectSearcher(scope, query);

        //Get the results 
        ManagementObjectCollection results = searcher.Get();

        //Loop through the results
        if (results.Count > 0)
        {
            foreach (ManagementObject manObj in results)
            {
                returnVal = manObj;
                //Break the loop if the returnVal is not null
                if (returnVal != null)
                {
                    break;
                }
            }
        }
    }
    return returnVal;
}
