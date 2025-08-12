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
    string systemPath = Environment.GetEnvironmentVariable("PATH");

    // Checks if the PATH already contains the new path
    if (systemPath.Contains(pathUrl))
        return;

    // Append the new path to existing PATH
    string newPath = systemPath + ";" + pathUrl;

    // Updating the PATH string using the registry
    Registry.LocalMachine.CreateSubKey(environmentKey).SetValue("Path", newPath, RegistryValueKind.ExpandString);
}


