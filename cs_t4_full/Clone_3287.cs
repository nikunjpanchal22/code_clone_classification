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
	    string domain = "";
	    try {
		using(PrincipalContext pc = new PrincipalContext(ContextType.Domain))
		{
		    domain = pc.ConnectedServer;
		}
		if (Environment.MachineName.Equals(domain, StringComparison.OrdinalIgnoreCase)) {
		    domain = "";
		}
	    }
	    catch {}
	    return domain;
}


