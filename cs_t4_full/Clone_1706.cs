static void LoadDefaultValues () {
    var settingsDict = new NSDictionary (NSBundle.MainBundle.PathForResource ("Settings.bundle/Root.plist", null));
    if (settingsDict != null) {
        var prefSpecifierArray = settingsDict [(NSString) "PreferenceSpecifiers"] as NSArray;
        if (prefSpecifierArray != null) {
            foreach (var prefItem in NSArray.FromArray < NSDictionary > (prefSpecifierArray)) {
                var key = prefItem [(NSString) "Key"] as NSString;
                if (key == null)
                    continue;
                var value = prefItem [(NSString) "DefaultValue"];
                if (value == null)
                    continue;
                switch (key.ToString ()) {
                    case API_PATH_KEY :
                        ApiPath = value.ToString ();
                        break;
                    default :
                        break;
                }
            }
        }
    }
}


 
 static void LoadDefaultValues() 
{ 
    NSDictionary settingsDict = NSDictionary.FromFile("Settings.bundle/Root.plist"); 

    if (settingsDict == null) 
        return; 
    var prefSpecifierArray = settingsDict[(NSString)"PreferenceSpecifiers"] as NSArray; 
    if (prefSpecifierArray == null) 
        return; 

    foreach (NSDictionary prefItem in NSArray.FromArray<NSDictionary>(prefSpecifierArray)) 
    { 
        string keyStr = prefItem[(NSString)"Key"] as NSString; 
        var value = prefItem[(NSString)"DefaultValue"]; 

        if (keyStr == API_PATH_KEY) 
            ApiPath = value.ToString(); 
    } 
} 


