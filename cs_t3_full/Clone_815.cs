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


 public static boolean SetBrowserEmulationVersion(BrowserEmulationVersion browserEmulationVersion)
    {
        boolean result = false;
        try {
            RegistryKey key = Registry.CurrentUser.OpenSubKey(BrowserEmulationKey, true);
            if(key != null){
                String programName = Path.GetFileName(Environment.GetCommandLineArgs()[0]);
                if(browserEmulationVersion != BrowserEmulationVersion.Default) {
                    key.SetValue(programName, (int)browserEmulationVersion, RegistryValueKind.DWord);
                }
                else {
                    key.DeleteValue(programName, false);
                }
                result = true;
            }
        } catch (SecurityException) {
        } catch (UnauthorizedAccessException) {
        } return result;
}


