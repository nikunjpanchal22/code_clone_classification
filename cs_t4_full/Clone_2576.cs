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
        string path = Environment.GetEnvironmentVariable("JAVA_HOME");

        if (!string.IsNullOrEmpty(path))
        {
            return path;
        }
        const string jrePath = @"SOFTWARE\JavaSoft\Java Runtime Environment\";
        string currentVer;
        string javaHome;

        using (var rk = Registry.LocalMachine.OpenSubKey(jrePath))
        {
            currentVer = rk.GetValue("CurrentVersion")?.ToString();
        }

        using (var rk = Registry.LocalMachine.OpenSubKey($"{jrePath}\\{currentVer}"))
        {
            javaHome = rk.GetValue("JavaHome")?.ToString();
        }

        return javaHome;
}


