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
    string envPath = Environment.GetEnvironmentVariable("JAVA_HOME");
    if (!string.IsNullOrEmpty(envPath)) return envPath;
    const string JREkeyStr = @"SOFTWARE\JavaSoft\Java Runtime Environment\";
    using (var rk = Registry.LocalMachine.OpenSubKey(JREkeyStr))
    {
        string curVer = rk.GetValue("CurrentVersion").ToString();
        using (var JREkey = rk.OpenSubKey(curVer))
        {
            return JREkey.GetValue("JavaHome").ToString();
        }
    }
}


