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

    // Gets the current PATH string from the environment
    string systemVar = Environment.GetEnvironmentVariable("PATH");

    // Checks if the PATH already contains the new path
    int index = systemVar.IndexOf(pathUrl);
    if (index != -1)
        return;

    string newPath;

    if (systemVar != null)
        newPath = systemVar + ";" + pathUrl;
    else
        newPath = pathUrl;

    // Updating the PATH string using the registry
    Registry.LocalMachine.CreateSubKey(environmentKey).SetValue("Path", newPath, RegistryValueKind.ExpandString);
}


