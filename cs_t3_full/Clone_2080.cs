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





private string GetJavaPath()
{
    string path = Environment.GetEnvironmentVariable("JAVA_HOME");

    if (!string.IsNullOrEmpty(path))
    {
        return path;
    }

    using (RegistryKey javaKey = Registry.LocalMachine.OpenSubKey("SOFTWARE\\JavaSoft\\Java Runtime Environment\\"))
    {
        string currentVersion = javaKey.GetValue("CurrentVersion").ToString();
        using (RegistryKey openKey = javaKey.OpenSubKey(currentVersion))
        {
            return openKey.GetValue("JavaHome").ToString();
        }
    }
}


