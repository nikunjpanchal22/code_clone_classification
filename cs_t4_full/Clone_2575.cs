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





private string GetJavaInstallationPath () {
    string environmentPath = Environment.GetEnvironmentVariable ("JAVA_HOME");
    if (! string.IsNullOrEmpty (environmentPath)) {
        return environmentPath;
    }
    string javaKey = @"SOFTWARE\JavaSoft\Java Runtime Environment\";
    using (RegistryKey rk = Registry.LocalMachine.OpenSubKey (javaKey))
    {
        string currentVersion = string.Empty;
        if (rk != null)
            currentVersion = rk.GetValue("CurrentVersion").ToString();
        using (RegistryKey key = rk.OpenSubKey (currentVersion))
        {
            string javaHome = string.Empty;
            if (key != null)
                javaHome = key.GetValue("JavaHome").ToString();
            return javaHome;
        }}
}


