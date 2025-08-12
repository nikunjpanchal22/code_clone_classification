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
        ManagementObject returnValue = null; 
        ConnectionOptions options = new ConnectionOptions(); 
        ManagementScope scope = new ManagementScope (@"\\localhost\root\MicrosoftIISv2", options); 
        scope.Connect(); 
            
        if (scope.IsConnected) 
        { 
            ObjectQuery query = new ObjectQuery(String.Format("SELECT * FROM IIsWebServerSetting WHERE ServerComment = '{0}'", serverComment)); 
            ManagementObjectSearcher searcher = new ManagementObjectSearcher(scope, query); 
            ManagementObjectCollection results = searcher.Get(); 
                
            if (results.Count > 0) 
            { 
                foreach (ManagementObject managementObj in results) 
                { 
                    returnValue = managementObj; 
                    break; 
                } 
            } 
        } 
        return returnValue; 
    } 

 public static ManagementObject GetWebServerSettingsByServerComment(string serverComment)
{
    ManagementObject returnVal = null;
    //Create a new ManagementScope
    ManagementScope scope = new ManagementScope(@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());

    //Connect to the scope
    scope.Connect();
    if (scope.IsConnected)
    {
        //Create a query using the serverComment
        ObjectQuery query = new ObjectQuery(String.Format("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment));

        //Create a new ManagementObjectSearcher
        ManagementObjectSearcher searcher = new ManagementObjectSearcher(scope, query);

        //Get the results
        ManagementObjectCollection results = searcher.Get();

        //Loop through the sum of results
        if (results.Count > 0)
        {
            foreach (ManagementObject managementObj in results)
            {
                //Assign the managementObj to the returnVal
                returnVal = managementObj;
                //Break the loop
                if (returnVal != null)
                {
                    break;
                }
            }
        }
    }

    return returnVal;
}
