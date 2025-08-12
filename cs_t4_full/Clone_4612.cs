[System.Security.Permissions.SecurityPermission (System.Security.Permissions.SecurityAction.Demand)] public override void Commit (IDictionary savedState) {
    base.Commit (savedState);
    string environmentVar = Environment.GetEnvironmentVariable ("PATH");
    string oldPath = (string) Registry.LocalMachine.CreateSubKey (environmentKey).GetValue ("Path", "", RegistryValueOptions.DoNotExpandEnvironmentNames);
    var index = oldPath.IndexOf (pathUrl);
    if (index < 0) {
        Registry.LocalMachine.CreateSubKey (environmentKey).SetValue ("Path", oldPath + ";" + pathUrl, RegistryValueKind.ExpandString);
    }
}


 [System.Security.Permissions.SecurityPermission (System.Security.Permissions.SecurityAction.Demand)] public override void Commit (IDictionary savedState) 
{
    base.Commit (savedState);

    string path = Environment.GetEnvironmentVariable ("PATH");
    string oldPath = Registry.LocalMachine.CreateSubKey (environmentKey).GetValue ("Path", "", RegistryValueOptions.DoNotExpandEnvironmentNames);
    if (oldPath.Contains(pathUrl))
        return;
    path += ";" + pathUrl;

    // Updating the PATH string using the registry
    Registry.LocalMachine.CreateSubKey(environmentKey).SetValue("Path", path, RegistryValueKind.ExpandString);
}


