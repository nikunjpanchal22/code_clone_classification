public static bool Is32bitProcess (Process proc) {
    if (! IsThis64bitProcess ())
        return true;
    foreach (ProcessModule module in proc.Modules) {
        try {
            string fname = Path.GetFileName (module.FileName).ToLowerInvariant ();
            if (fname.Contains ("wow64")) {
                return true;
            }
        }
        catch {
        }
    }
    return false;
}


 public static bool Is32bitProcess (Process proc) {
    if (!IsThis64bitProcess ())
        return true;

    foreach (ProcessModule module in proc.Modules) {
        try {
            string fName =
Path.GetFileName(module.FileName).ToLowerInvariant();
            if (fName.IndexOf("wow64",
StringComparison.CurrentCultureIgnoreCase) >= 0) {
                return true;
            }
        }
        catch {
        }
    }
    return false;
}
