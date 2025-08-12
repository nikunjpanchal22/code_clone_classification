static string GetUserDomainName () {
    string domain = String.Empty;
    try {
        domain = Environment.UserDomainName;
        string machineName = Environment.MachineName;
        if (machineName.Equals (domain, StringComparison.OrdinalIgnoreCase)) {
            domain = String.Empty;
        }
    }
    catch {
    }
    return domain;
}





static string GetUserDomainName () {
	    string domain = null;
	    try {
		domain = System.Environment.UserDomainName;
		if (System.Environment.MachineName.Equals (domain, StringComparison.OrdinalIgnoreCase)) {
		    domain = null;
		}
	    }
	    catch {}
	    return domain;
}


