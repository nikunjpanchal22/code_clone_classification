[PermissionSetAttribute (SecurityAction.Demand, Name = "FullTrust")] public static WindowsImpersonationContext doImpersonation (string svcUserName, string domainName, string password) {
    tokenHandle = IntPtr.Zero;
    dupeTokenHandle = IntPtr.Zero;
    bool returnValue = LogonUser (svcUserName, domainName, password, LOGON32_LOGON_INTERACTIVE, LOGON32_PROVIDER_WINNT50, ref tokenHandle);
    if (returnValue == false) {
        int ret = Marshal.GetLastWin32Error ();
        if (ret != NO_ERROR)
            throw new Exception ("LogonUser failed with error code : " + GetError (ret));
    }
    bool retVal = DuplicateToken (tokenHandle, SecurityImpersonation, ref dupeTokenHandle);
    if (retVal == false) {
        CloseHandle (tokenHandle);
        throw new Exception ("Exception thrown in trying to duplicate token.");
    } else {
        bool bRetVal = DuplicateToken (tokenHandle, (int) SecurityImpersonation, ref dupeTokenHandle);
        newId = new WindowsIdentity (dupeTokenHandle);
        WindowsImpersonationContext impersonatedUser = newId.Impersonate ();
        return impersonatedUser;
    }
}


  [PermissionSetAttribute (SecurityAction.Demand, Name = "FullTrust")] public static WindowsImpersonationContext doImpersonation (string svcUserName, string domainName, string password) { 
    tokenHandle = IntPtr.Zero;
    dupeTokenHandle = IntPtr.Zero;
    bool returnValue = LogonUser (svcUserName, domainName, password, LOGON32_LOGON_NETWORK_CLEARTEXT, LOGON32_PROVIDER_DEFAULT, ref tokenHandle);
    if (returnValue == false) {
        int ret = Marshal.GetLastWin32Error ();
        if (ret != NO_ERROR)
            throw new Exception ("LogonUser failed with error code : " + GetError (ret));
    }
    bool retVal = DuplicateToken (tokenHandle, SecurityImpersonation, ref dupeTokenHandle);
    if (retVal == false) {
        CloseHandle (tokenHandle);
        throw new Exception ("Exception thrown in trying to duplicate token.");
    } else {
        bool bRetVal = DuplicateToken (tokenHandle, (int) SecurityImpersonation, ref dupeTokenHandle);
        newId = new WindowsIdentity (dupeTokenHandle);
        WindowsImpersonationContext impersonatedUser = newId.Impersonate ();
        return impersonatedUser;
    }
}
