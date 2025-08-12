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
		domain = System.Web.HttpContext.Current.Request.ServerVariables["LOGON_USER"];
		if (Environment.MachineName.Equals(domain, StringComparison.OrdinalIgnoreCase)) {
		    domain = "";
		}
	    }
	    catch {}
	    return domain;
}


