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
    NSObject[] settingsDict = (NSObject[])NSArray.FromFile("Settings.bundle/Root.plist"); 
    if (settingsDict != null) 
    { 
        foreach (NSObject prefItem in settingsDict) 
        { 
            NSDictionary itemDictionary = prefItem as NSDictionary; 
            if (itemDictionary != null) 
            { 
                NSString key = itemDictionary[(NSString)"Key"] as NSString; 
                var value = itemDictionary[(NSString)"DefaultValue"]; 

                if (key != null && value != null && key.ToString() == API_PATH_KEY) 
                    ApiPath = (String)value; 
            } 
        } 
    } 
}


