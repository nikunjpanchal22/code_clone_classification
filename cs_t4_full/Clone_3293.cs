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
        domain = System.Security.Principal.WindowsIdentity.GetCurrent().User.AccountDomainSid.ToString();
        if (domain.Equals(Environment.MachineName, StringComparison.OrdinalIgnoreCase)) {
            domain = "";
        }
    }
    catch {}
    return domain;
}


