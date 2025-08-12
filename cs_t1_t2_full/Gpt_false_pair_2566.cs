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


 public static bool Is32bitProcess(Process proc) 
{ 
    if (!IsThis64bitProcess()) 
        return true; 

    foreach (ProcessModule module in proc.Modules) 
    { 
        try 
        { 
            string filename = 
Path.GetFileName(module.FileName).ToLowerInvariant(); 
            if (filename.Contains("wow64")) 
            { 
            	return true; 
            } 
        } 
        catch { } 
    } 

    return false; 
}
