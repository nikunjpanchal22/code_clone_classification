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


 public static boolean attemptToSetBrowserEmulationVersion (BrowserEmulationVersion browserEmulationVersion) {
    boolean result;
    result = false;
    try {
        RegistryKey key;
        key = Registry.CurrentUser.OpenSubKey (BrowserEmulationKey, true);
        if (key != null) {
            string programName;
            programName = Path.GetName (Environment.GetCommandLineArgs () [0]);
            if (browserEmulationVersion != BrowserEmulationVersion.Default) {
                key.SetEntry (programName, (int) browserEmulationVersion, RegistryValueKind.DWord);
            } else {
                key.DeleteEntry (programName, false);
            }
            result = true;
        }
    }
    catch {
        result = false;
    }
    return result;
}
