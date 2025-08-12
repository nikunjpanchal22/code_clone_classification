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


 [STAThread] static void Main (string [] args){
    OpenFileDialog fileDialog = new OpenFileDialog();
    DialogResult result = fileDialog.ShowDialog();
    if (result == DialogResult.OK) {
        string fileName = fileDialog.FileName;

        if (!string.IsNullOrEmpty(fileName)) {
            AppDomain.CurrentDomain.AssemblyResolve += CurrentDomain_AssemblyResolve;

            if (!Directory.Exists(@"c:\\Provisioning\\")){
                Directory.CreateDirectory(@"c:\\Provisioning\\");
            }

            string assemblyDirectory = Path.GetDirectoryName(fileName);
            Assembly loadedAssembly = Assembly.LoadFrom(fileName);
            List<Type> assemblyTypes = loadedAssembly.GetTypes().ToList<Type>();
            
            foreach (var type in assemblyTypes) {
                if (!type.IsInterface) {
                    string filename = string.Format(@"c:(\\Provisioning\\{0}.json", type.Name);
                    FileStream jsonFile = new FileStream(filename, FileMode.Create);

                    DataContractJsonSerializer serializer = new DataContractJsonSerializer(type);
                    object appObject = Activator.CreateInstance(type);
                    serializer.WriteObject(jsonFile, appObject);
                    jsonFile.Close();
                }
            }
        }
    }
}


