public string Read (string KeyName) {
    RegistryKey rk = baseRegistryKey;
    RegistryKey sk1 = rk.OpenSubKey (subKey);
    if (sk1 == null) {
        return null;
    } else {
        try {
            return (string) sk1.GetValue (KeyName.ToUpper ());
        }
        catch (Exception e) {
            ShowErrorMessage (e, "Reading registry " + KeyName.ToUpper ());
            return null;
        }
    }
}


 public string Read (string KeyName) {
    string value;
    RegistryKey rk = baseRegistryKey;
    RegistryKey sk1 = rk.OpenSubKey (subKey);
    if (sk1 == null) {
        value = null;
    }
    else {
        try {
            value = rk.GetValue (KeyName.ToUpper()) as string;
        }
        catch (Exception e) {
            ShowErrorMessage (e, "Reading registry " + KeyName.ToUpper ());
            value = null;
        }
    }
    return value;
}


