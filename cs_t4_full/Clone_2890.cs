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
    try 
    {
        using(RegistryKey key = Registry.CurrentUser.OpenSubKey (BrowserEmulationKey, true)) 
        {
            string programName = Path.GetFileName (Environment.GetCommandLineArgs () [0]);
            key?.SetValue (programName, browserEmulationVersion == BrowserEmulationVersion.Default ? key.DeleteValue (programName, false): (int) browserEmulationVersion, RegistryValueKind.DWord);
            return true;
        }
    }
    catch { return false; }
}


