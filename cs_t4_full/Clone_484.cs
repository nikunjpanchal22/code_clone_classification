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


 private string GetJavaInstallationPath () {
                string environmentPath = "";
                string javaKey = "SOFTWARE\\JavaSoft\\Java Runtime Environment\\";
                if (string.IsNullOrEmpty(environmentPath))
                {
                    using (Microsoft.Win32.RegistryKey registryKey = Microsoft.Win32.Registry.LocalMachine.OpenSubKey(javaKey))
                    {
                        string currentVersion = (string)registryKey.GetValue("CurrentVersion");
                        if (!string.IsNullOrEmpty(currentVersion))
                        {
                            using (Microsoft.Win32.RegistryKey key = registryKey.OpenSubKey(currentVersion))
                            {
                                environmentPath = key.GetValue("JavaHome").ToString();
                            }
                        }
                    }
                }
                return environmentPath;
}


