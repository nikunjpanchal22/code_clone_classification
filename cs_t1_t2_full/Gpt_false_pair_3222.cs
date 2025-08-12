[STAThread] static void Main (string [] args) {
    fileDialog.ShowDialog ();
    string fileName = fileDialog.FileName;
    if (string.IsNullOrEmpty (fileName) == false) {
        AppDomain.CurrentDomain.AssemblyResolve += CurrentDomain_AssemblyResolve;
        if (Directory.Exists (@"c:\Provisioning\") == false)
            Directory.CreateDirectory (@"c:\Provisioning\");
        assemblyDirectory = Path.GetDirectoryName (fileName);
        Assembly loadedAssembly = Assembly.LoadFile (fileName);
        List < Type > assemblyTypes = loadedAssembly.GetTypes ().ToList < Type > ();
        foreach (var type in assemblyTypes) {
            if (type.IsInterface == false) {
                StreamWriter jsonFile = File.CreateText (string.Format (@"c:\Provisioning\{0}.json", type.Name));
                JavaScriptSerializer serializer = new JavaScriptSerializer ();
                jsonFile.WriteLine (serializer.Serialize (Activator.CreateInstance (type)));
                jsonFile.Close ();
            }
        }
    }
}


[STAThread] static void Main (string [] args) {
    fileDialog.ShowDialog ();
    string fileName = fileDialog.FileName;
    if (string.IsNullOrEmpty (fileName) == false) {
        AppDomain.CurrentDomain.AssemblyResolve += CurrentDomain_AssemblyResolve;
        if (Directory.Exists (@"c:\Provisioning\") == false)
            Directory.CreateDirectory (@"c:\Provisioning\");
        assemblyDirectory = Path.GetDirectoryName (fileName);
        Assembly loadedAssembly = Assembly.LoadFile (fileName);
        List < Type > assemblyTypes = loadedAssembly.GetTypes ().ToList < Type > ();
        foreach (var type in assemblyTypes) {
            if (type.IsInterface == false) {
                StreamWriter jsonFile = File.CreateText (string.Format (@"c:\Provisioning\{0}.json", type.Name));
                var serializer = new DataContractJsonSerializer (type);
                jsonFile.WriteLine (serializer.Serialize (Activator.CreateInstance (type)));
                jsonFile.Close ();
            }
        }
    }
}
