private string GetJavaInstallationPath () {
    string environmentPath = Environment.GetEnvironmentVariable ("JAVA_HOME");
    if (! string.IsNullOrEmpty (environmentPath)) {
        return environmentPath;
    }
    string javaKey = "SOFTWARE\\JavaSoft\\Java Runtime Environment\\";
    using (Microsoft.Win32.RegistryKey rk = Microsoft.Win32.Registry.LocalMachine.OpenSubKey (javaKey))
    {
        string currentVersion = rk.GetValue ("CurrentVersion").ToString ();
        using (Microsoft.Win32.RegistryKey key = rk.OpenSubKey (currentVersion))
        {
            return key.GetValue ("JavaHome").ToString ();
        }}
}


 private string GetJavaInstallationPath() 
{ 
    string path = System.Environment.GetEnvironmentVariable("JAVA_HOME"); 
    if (string.IsNullOrEmpty(path)) 
    { 
        using (Microsoft.Win32.RegistryKey key = Microsoft.Win32.Registry.LocalMachine.OpenSubKey("SOFTWARE\\JavaSoft\\Java Runtime Environment")) 
        { 
            string currentVersion = (string)key.GetValue("CurrentVersion"); 
            if (!string.IsNullOrEmpty(currentVersion)) 
            { 
                using (Microsoft.Win32.RegistryKey keyCurrentVersion = key.OpenSubKey(currentVersion)) 
                { 
                    path = (string)keyCurrentVersion.GetValue("JavaHome"); 
                } 
            } 
        } 
    } 
    return path; 
}


