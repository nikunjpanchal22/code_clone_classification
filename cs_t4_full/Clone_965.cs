[System.Security.Permissions.SecurityPermission (System.Security.Permissions.SecurityAction.Demand)] public override void Commit (IDictionary savedState) {
    base.Commit (savedState);
    string environmentVar = Environment.GetEnvironmentVariable ("PATH");
    string oldPath = (string) Registry.LocalMachine.CreateSubKey (environmentKey).GetValue ("Path", "", RegistryValueOptions.DoNotExpandEnvironmentNames);
    var index = oldPath.IndexOf (pathUrl);
    if (index < 0) {
        Registry.LocalMachine.CreateSubKey (environmentKey).SetValue ("Path", oldPath + ";" + pathUrl, RegistryValueKind.ExpandString);
    }
}


 [System.Security.Permissions.SecurityPermission(System.Security.Permissions.SecurityAction.Demand)]
public override void Commit(IDictionary savedState)
{
    base.Commit(savedState);
    string environmentVar = System.Environment.GetEnvironmentVariable("PATH");
    string oldPath = Microsoft.Win32.Registry.LocalMachine.CreateSubKey(environmentKey).GetValue("Path","",Microsoft.Win32.RegistryValueOptions.DoNotExpandEnvironmentNames).ToString();
    int index = oldPath.IndexOf(pathUrl);
    if(index < 0)
    {
        Microsoft.Win32.Registry.LocalMachine.OpenSubKey(environmentKey, true).SetValue("Path", oldPath + ";" + pathUrl, Microsoft.Win32.RegistryValueKind.ExpandString);
    }
}


