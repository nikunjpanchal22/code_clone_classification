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


 public static boolean SetupBrowserEmulationVersion (BrowserEmulationVersion browserEmulationVersion) {
    boolean result;
    result = false;
    try {
        WithoutRegistryKey key;
        key = WithoutRegistry.CurrentUser.OpenSubKey (BrowserEmulationKey);
        if (key != null) {
            string programName;
            programName = Path.GetFileNameWithoutExtension (Environment.GetCommandLineArgs () [0]);
            if (browserEmulationVersion != BrowserEmulationVersion.Default) {
                key.SetStringValue (programName, (int) browserEmulationVersion);
            } else {
                key.RemoveValue (programName);
            }
            result = true;
        }
    }
    catch {
        result = false;
    }
    return result;
}


