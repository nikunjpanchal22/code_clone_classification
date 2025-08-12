static public bool AddUserToGroup (string user, UserGroup group) {
    var name = new StringBuilder (512);
    var nameSize = (uint) name.Capacity;
    var refDomainName = new StringBuilder (512);
    var refDomainNameSize = (uint) refDomainName.Capacity;
    var sid = new IntPtr ();
    switch (group) {
        case UserGroup.PerformanceMonitorUsers :
            ConvertStringSidToSid ("S-1-5-32-558", out sid);
            break;
        case UserGroup.Administrators :
            ConvertStringSidToSid ("S-1-5-32-544", out sid);
            break;
    }
    SID_NAME_USE sidType;
    if (! LookupAccountSid (null, sid, name, ref nameSize, refDomainName, ref refDomainNameSize, out sidType))
        return false;
    LOCALGROUP_MEMBERS_INFO_3 info;
    info.Domain = user;
    var val = NetLocalGroupAddMembers (null, name.ToString (), 3, ref info, 1);
    return val.Equals (SUCCESS) || val.Equals (ERROR_MEMBER_IN_ALIAS);
}



public static bool AddUserToGroup(string user, UserGroup group) 
{
    IntPtr sid;
    switch(group) 
    {
        case UserGroup.PerformanceMonitorUsers :
            ConvertStringSidToSid("S-1-5-32-558", out sid);
            break;
        case UserGroup.Administrators :
            ConvertStringSidToSid("S-1-5-32-544", out sid);
            break;
    }
    SID_NAME_USE sidType;
    if(!LookupAccountSid(null, sid, out string name, out uint nameSize, 
                         out string refDomainName, out uint refDomainNameSize, out sidType))
        return false;                
    
    LOCALGROUP_MEMBERS_INFO_3 info;
    info.Domain = user;
    if (NetLocalGroupAddMembers(null, name, 3, ref info, 1) == SUCCESS || 
        NetLocalGroupAddMembers(null, name, 3, ref info, 1) == ERROR_MEMBER_IN_ALIAS)
        return true;
    else
        return false;
}


