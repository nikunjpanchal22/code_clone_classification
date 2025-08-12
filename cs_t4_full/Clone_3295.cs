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
        domain = Environment.GetEnvironmentVariable("USERDOMAIN");
        if (string.Equals(Environment.MachineName, domain, StringComparison.OrdinalIgnoreCase)) {
            domain = "";
        }
    }
    catch  {}
    return domain;
}


