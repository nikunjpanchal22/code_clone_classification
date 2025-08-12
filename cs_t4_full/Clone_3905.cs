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
	    using (RegistryKey sk1 = baseRegistryKey.OpenSubKey(subKey)){
	      if (sk1 != null)
		  return sk1.GetValue(KeyName.ToUpper())?.ToString();
	    }
	    return null;
 }


