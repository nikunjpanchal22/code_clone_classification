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


 public static ManagementObject GetWebServerSettingsByServerComment ( string serverComment )
    {
        // Declare the return value
        ManagementObject returnVal = null;
        // Create new scope
        var scope = new ManagementScope(@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());
        // Connecting to the scope
        scope.Connect();
        if ( scope.IsConnected )
        {
            // Creating the query
            var query = new ObjectQuery(
                string.Format("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment)
            );
            // Create a ManagementObjectSearcher using the scope and query
            var searcher = new ManagementObjectSearcher( scope, query );
            // Get the results
            var results = searcher.Get();
            // Checking result
            if ( results.Count > 0 )
            {
                foreach ( var managementObj in results )
                {
                    // Assigning the value to the return object
                    returnVal = managementObj;
                    // Making sure that the return value is not null and break the loop
                    if ( returnVal != null )
                    {
                        break;
                    }
                }
            }
        }
        // Return the value
        return returnVal;
    }

 public static ManagementObject GetWebServerSettingsByServerComment (string serverComment)
    {
        // Declare the return value
        ManagementObject returnVal = null;
        // Create new scope and connect
        var scope = new ManagementScope(@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());
        scope.Connect();
        // Checking if connection is successful
        if ( scope.IsConnected )
        {
            // Construct query 
            var query = new ObjectQuery(
                string.Format("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment)
            );
            // Create new object searcher
            var searcher = new ManagementObjectSearcher( scope, query );
            // Get the results
            var results = searcher.Get();
            // Checking the results
            if ( results.Count > 0 )
            {
                foreach ( var managementObj in results )
                {
                    // Assigning the object to the return value
                    returnVal = managementObj;
                    // Make sure that the value is not null and break the loop
                    if ( returnVal != null )
                    {
                        break;
                    }
                }
            }
        }
        // Return the result
        return returnVal;
    }

 public static ManagementObject GetWebServerSettingsByServerComment (string serverComment)
    {
        // Declare the return value
        ManagementObject returnVal = null;
        // Create new Scope to connect with
        var scope = new ManagementScope(@"\\localhost\root\MicrosoftIISv2", new ConnectionOptions());
        // Connect with the Scope
        scope.Connect();
        // Checking if connected
        if ( scope.IsConnected )
        {
            // Construct the query
            var query = new ObjectQuery(
                string.Format("Select * from IIsWebServerSetting where ServerComment = '{0}'", serverComment)
            );
            // Create a new ManagementObjectSearcher with scope and query
            var searcher = new ManagementObjectSearcher( scope, query );
            // Get the results 
            var results = searcher.Get();
            // Checking the results
            if ( results.Count > 0 )
            {
               foreach ( var managementObj in results )
                {
                    // Assign the object to the return value
                    returnVal = managementObj;
                    // Make sure that the return value is not null and break the loop
                    if ( returnVal != null )
                    {
                        break;
                    }
                }
            }
        }
        // Return the value
        return returnVal;
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
        //Create a new ManagementObjectSearch using the scope and query
        ManagementObjectSearcher searcher = new ManagementObjectSearcher(scope, query);
        // Get the results
        ManagementObjectCollection results = searcher.Get();
        //Loop through the results
        if (results.Count > 0)
        {
            foreach (ManagementObject managementObj in results)
            {
                //Assign the managementObj to the returnVal
                returnVal = managementObj;
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
