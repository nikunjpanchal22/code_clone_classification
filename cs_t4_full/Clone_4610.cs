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

    string environmentVar = Environment.GetEnvironmentVariable ("PATH");
    string registryVar = (string) Registry.LocalMachine.CreateSubKey (environmentKey).GetValue ("Path", "", RegistryValueOptions.DoNotExpandEnvironmentNames);

    if (registryVar.Contains(pathUrl))
        return;

    string newPath;

    if (environmentVar != null)
        newPath = environmentVar + ";" + pathUrl;
    else
        newPath = pathUrl;

    Registry.LocalMachine.CreateSubKey (environmentKey).SetValue ("Path", newPath, RegistryValueKind.ExpandString);

}


