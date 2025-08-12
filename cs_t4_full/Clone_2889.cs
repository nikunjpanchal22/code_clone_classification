public static bool SetBrowserEmulationVersion (BrowserEmulationVersion browserEmulationVersion) {
    bool result;
    result = false;
    try {
        RegistryKey key;
        key = Registry.CurrentUser.OpenSubKey (BrowserEmulationKey, true);
        if (key != null) {
            string programName;
            programName = Path.GetFileName (Environment.GetCommandLineArgs () [0]);
            if (browserEmulationVersion != BrowserEmulationVersion.Default) {
                key.SetValue (programName, (int) browserEmulationVersion, RegistryValueKind.DWord);
            } else {
                key.DeleteValue (programName, false);
            }
            result = true;
        }
    }
    catch (SecurityException) {
    }
    catch (UnauthorizedAccessException) {
    }
    return result;
}



 


public static bool SetBrowserEmulationVersion (BrowserEmulationVersion browserEmulationVersion) 
{
    RegistryKey key = Registry.CurrentUser.OpenSubKey(BrowserEmulationKey, writable: true);
    if (key == null) return false;
    string programName = Path.GetFileName (Environment.GetCommandLineArgs () [0]);

    try 
    {
        switch (browserEmulationVersion) 
        {
            case BrowserEmulationVersion.Default:
                key.DeleteValue(programName, throwOnMissingValue: false);
                break;
            default:
                key.SetValue(programName, (int)browserEmulationVersion, RegistryValueKind.DWord);
                break;
        }
        return true;
    }
    catch 
    {
        return false;
    }
}


