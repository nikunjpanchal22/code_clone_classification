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
    if (!IsThis64bitProcess ()) return true;

    IEnumerator _moduleEnumerator = proc.Modules.GetEnumerator ();
    while (_moduleEnumerator.MoveNext ()) {
        try {
            string fileName = 
Path.GetFileName (((ProcessModule)_moduleEnumerator.Current).FileName).ToLowerInvariant ();
            if (fileName.Contains ("wow64")) return true;
        }
        catch {
        }
    }
    return false;
}


