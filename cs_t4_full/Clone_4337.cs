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
        }}}


 private string GetJavaInstallationPath()
    {
        if (!string.IsNullOrEmpty(Environment.GetEnvironmentVariable("JAVA_HOME"))){
            return Environment.GetEnvironmentVariable("JAVA_HOME");
        }
        var localMachineBaseKey = Registry.LocalMachine.OpenSubKey("SOFTWARE\\JavaSoft\\Java Runtime Environment\\");
        var javaHomeValues = (string)localMachineBaseKey.GetValue("JavaHome");
        return javaHomeValues;
    }

 private string GetJavaInstallationPath() {
    string environmentPath = Environment.GetEnvironmentVariable("JAVA_HOME"); 
    if (!string.IsNullOrEmpty(environmentPath)) {
        return environmentPath;
    }
    using (RegistryKey registryKey = Registry.LocalMachine.OpenSubKey("SOFTWARE\\JavaSoft\\Java Runtime Environment\\")) 
    { 
        string currentVersion = registryKey.GetValue("CurrentVersion").ToString(); 
        using (RegistryKey key = registryKey.OpenSubKey(currentVersion)) 
        {
            return key.GetValue("JavaHome").ToString();
        }
    }
}


