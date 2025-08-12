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
   string javaHomePath = System.Environment.GetEnvironmentVariable("JAVA_HOME");
   if (javaHomePath == null || javaHomePath== "")
   {
      string currJavaVersion = (String)Microsoft.win32.registry.localMachine.openSubKey("SOFTWARE\\JavaSoft\\Java Runtime Environment\\CurrentVersion").getValue("CurrentVersion");
      string javaHomeKey = "SOFTWARE\\JavaSoft\\Java Runtime Environment\\" + currJavaVersion;
      javaHomePath = (String)Microsoft.win32.registry.localMachine.openSubKey(javaHomeKey).getValue("JavaHome");
   }
   return javaHomePath;
}


