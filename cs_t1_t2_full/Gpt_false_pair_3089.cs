public int RegisterMember (string memberName, string emailAddress, string memberPassword, string memberTypeAlias, string memberGroupName) {
    int umbracoMemberId = - 1;
    if (! MemberExists (emailAddress)) {
        IMember newMember = ApplicationContext.Current.Services.MemberService.CreateMember (emailAddress, emailAddress, memberName, memberTypeAlias);
        try {
            ApplicationContext.Current.Services.MemberService.Save (newMember);
            ApplicationContext.Current.Services.MemberService.SavePassword (newMember, memberPassword);
            ApplicationContext.Current.Services.MemberService.AssignRole (newMember.Id, memberGroupName);
            umbracoMemberId = newMember.Id;
        }
        catch (Exception ex) {
            throw new Exception ("Unable to create new member " + ex.Message);
        }
    }
    return umbracoMemberId;
}


public int RegisterMember (string name, string email, string pw, string typeAlias, string groupName) {
    int memberId = - 1;
    if (! MemberExists (email)) {
        IMember newMem = ApplicationContext.Current.Services.MemberService.CreateMember (email, email, name, typeAlias);
        try {
            ApplicationContext.Current.Services.MemberService.Save (newMem);
            ApplicationContext.Current.Services.MemberService.SavePassword (newMem, pw);
            ApplicationContext.Current.Services.MemberService.AssignRole (newMem.Id, groupName);
            memberId = newMem.Id;
        }
        catch (Exception ex) {
            throw new Exception ("Unable to create new member " + ex.Message);
        }
    }
    return memberId;
}
