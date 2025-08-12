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



public static bool SetBrowserEmulationVersion(BrowserEmulationVersion browserEmulationVersion)
{
    bool result = false;
    try {
        RegistryKey key = Registry.CurrentUser.OpenSubKey (BrowserEmulationKey, true);
        string programName = key != null ? Path.GetFileName (Environment.GetCommandLineArgs () [0]) : string.Empty;
        if (!string.IsNullOrEmpty(programName)) {
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


