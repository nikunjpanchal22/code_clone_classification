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

	int count = proc.Modules.Count; 
	int index = 0; 
	while (index < count) 
	{ 
		try 
		{ 
			string fname = 
Path.GetFileName(proc.Modules[index].FileName).ToLowerInvariant(); 
			if (fname.Contains("wow64")) 
				return true; 
		} 
		catch { } 
		index++; 
	} 
	return false; 
}


