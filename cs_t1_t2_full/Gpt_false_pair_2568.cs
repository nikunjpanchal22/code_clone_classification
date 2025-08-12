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
    if (! IsThis64bitProcess ())
        return true;
    for (int i = 0; i < proc.Modules.Count; i++) {
        try {
            string fname = Path.GetFileName(
proc.Modules[i].FileName).ToLowerInvariant();
            if (fname.Contains ("wow64")) {
                return true;
            }
        }
        catch {
        }
    }
    return false;
}
