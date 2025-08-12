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
    var path = NSBundle.MainBundle.PathForResource("Settings.bundle/Root.plist", null); 
    if (path != null) 
    { 
        var settingsDict = NSDictionary.FromFile(path); 
        var prefSpecifierArray = settingsDict[(NSString)"PreferenceSpecifiers"] as NSArray; 
        if (prefSpecifierArray != null) 
        { 
            for (int i = 0; i < prefSpecifierArray.Count; i++) 
            { 
                NSDictionary prefItem = prefSpecifierArray.GetItem<NSDictionary>(i); 
                NSString key = prefItem[(NSString)"Key"] as NSString; 
                 var value = prefItem[(NSString)"DefaultValue"]; 

                if (key != null && value != null && key.ToString() == API_PATH_KEY) 
                    ApiPath = (String)value; 
            } 
        } 
    } 
} 


