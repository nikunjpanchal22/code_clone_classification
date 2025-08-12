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


 public static bool Is32bitProcess (Process proc) 
{ 
    if (!IsThis64bitProcess()) 
    { 
        return true; 
    } 

    System.Collections.IEnumerator processModuleEnumerator = 
proc.Modules.GetEnumerator(); 

    while (processModuleEnumerator.MoveNext()) 
    { 
        try 
        { 
            string fileName = 
Path.GetFileName(((ProcessModule)processModuleEnumerator.Current).FileName).ToLowerInvariant(); 
            if (fileName.Contains("wow64")) 
            { 
                return true; 
            } 
        } 
        catch { } 
    } 

    return false; 
}


