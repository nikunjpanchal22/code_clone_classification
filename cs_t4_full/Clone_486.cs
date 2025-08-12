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



 private string GetJavaInstallationPath () 
{ 
    string environmentPath = string.Empty;
    string javaKey = "SOFTWARE\\JavaSoft\\Java Runtime Environment\\";
    RegistryKey regKey = Registry.LocalMachine.OpenSubKey (javaKey);
    environmentPath = Convert.ToString ( Environment.GetEnvironmentVariable ("JAVA_HOME"));

    if (string.IsNullOrEmpty (environmentPath) && regKey != null)
    { 
        string currentVersion = (string) regKey.GetValue ("CurrentVersion");
        using (RegistryKey key = regKey.OpenSubKey (currentVersion))    
        {     
            environmentPath = (string) key.GetValue ("JavaHome");
        }
    }
    return environmentPath;
}


