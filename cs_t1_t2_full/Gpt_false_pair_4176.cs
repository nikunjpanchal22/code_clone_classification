private static void SetIEVersioneKeyforWebBrowserControl (string appName, int ieval) {
    RegistryKey Regkey = null;
    try {
        Regkey = Microsoft.Win32.Registry.LocalMachine.OpenSubKey (@"SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BROWSER_EMULATION", true);
        if (Regkey == null) {
            YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION Failed - Registry key Not found");
            return;
        }
        string FindAppkey = Convert.ToString (Regkey.GetValue (appName));
        if (FindAppkey == "" + ieval) {
            YukLoggerObj.logInfoMsg ("Application FEATURE_BROWSER_EMULATION already set to " + ieval);
            Regkey.Close ();
            return;
        }
        Regkey.SetValue (appName, unchecked ((int) ieval), RegistryValueKind.DWord);
        FindAppkey = Convert.ToString (Regkey.GetValue (appName));
        if (FindAppkey == "" + ieval)
            YukLoggerObj.logInfoMsg ("Application FEATURE_BROWSER_EMULATION changed to " + ieval + "; changes will be visible at application restart");
        else
            YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION setting failed; current value is  " + ieval);
    }
    catch (Exception ex) {
        YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION setting failed; " + ex.Message);
    }
    finally {
        if (Regkey != null)
            Regkey.Close ();
    }
}


private static void SetIEVersioneKeyforWebBrowserControl (string appName, int ieval) {
    RegistryKey Regkey = null;
    try {
        Regkey = Microsoft.Win32.Registry.LocalMachine.OpenSubKey (@"SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BROWSER_EMULATION", true);
        if (Regkey == null) {
            YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION Failed - Registry key Not found");
            return;
        }
        string FindAppkey = Convert.ToString (Regkey.GetValue (appName));
        if (FindAppkey == "" + ieval) {
            YukLoggerObj.logInfoMsg ("Application FEATURE_BROWSER_EMULATION already set to " + ieval);
            Regkey.Close ();
            return;
        }
        else { 
            Regkey.SetValue (appName, unchecked ((int) ieval), RegistryValueKind.DWord);
            string NewAppkey = Convert.ToString (Regkey.GetValue (appName));
            if (NewAppkey == "" + ieval)
                YukLoggerObj.logInfoMsg ("Application FEATURE_BROWSER_EMULATION changed to " + ieval + "; changes will be visible at application restart");
            else
                YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION setting failed; current value is  " + ieval);
        }
    }
    catch (Exception ex) {
        YukLoggerObj.logWarnMsg ("Application FEATURE_BROWSER_EMULATION setting failed; " + ex.Message);
    }
    finally {
        if (Regkey != null)
            Regkey.Close ();
    }
}
