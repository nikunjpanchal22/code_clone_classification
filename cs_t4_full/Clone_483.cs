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
      using (Microsoft.win32.RegistryKey RootKey = Microsoft.Win32.Registry.LocalMachine .OpenSubKey("SOFTWARE\\JavaSoft"))
      {
         using(Microsoft.win32.RegistryKey Key = RootKey.OpenSubKey("Java Runtime Environment"))
         {
            string CurrentVersion = (String)Key.GetValue("CurrentVersion");
            using (Microsoft.win32.RegistryKey Key1 = RootKey.OpenSubKey(CurrentVersion))
            {
               javaHomePath = (String)Key1.GetValue("JavaHome");
            }
         }
      }
   }
   return javaHomePath;
}


