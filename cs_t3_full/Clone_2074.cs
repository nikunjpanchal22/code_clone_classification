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
        string javaHome = Environment.GetEnvironmentVariable("JAVA_HOME");

        if (!string.IsNullOrEmpty(javaHome))
        {
            return javaHome;
        }

        const string javaKey = "SOFTWARE\\JavaSoft\\Java Runtime Environment\\";
        using (var registryKey = Registry.LocalMachine.OpenSubKey(javaKey))
        {
            var currentVersion = registryKey?.GetValue("CurrentVersion")?.ToString();
            using (var baseKey = registryKey?.OpenSubKey(currentVersion))
            {
                return baseKey?.GetValue("JavaHome")?.ToString();
            }
        }
}


