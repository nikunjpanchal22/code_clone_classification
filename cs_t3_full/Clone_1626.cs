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
    NSDictionary settingsDict = new NSDictionary(NSBundle.MainBundle.PathForResource("Settings.bundle/Root.plist", null)); 
    var prefSpecifierArray = settingsDict[(NSString)"PreferenceSpecifiers"] as NSArray; 
    if (prefSpecifierArray != null) 
    { 
        foreach (NSDictionary prefItem in NSArray.FromArray<NSDictionary>(prefSpecifierArray)) 
        { 
            NSString key = prefItem[(NSString)"Key"] as NSString; 
            var value = prefItem[(NSString)"DefaultValue"]; 

            switch (key.ToString()) 
            { 
            case API_PATH_KEY: 
                ApiPath = (String)value; 
                 break; 
            } 
        } 
    } 
} 


