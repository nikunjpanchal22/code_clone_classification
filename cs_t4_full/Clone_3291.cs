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
        domain = new System.DirectoryServices.DirectoryEntry("LDAP://rootDSE").Properties["defaultNamingContext"].Value as String;
        if (Environment.MachineName.Equals(domain, StringComparison.OrdinalIgnoreCase)) {
            domain = "";
        }
    }
    catch {}
    return domain;
}


