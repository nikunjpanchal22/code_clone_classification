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
    int userId = - 1;
    if (! MemberExists (email)) {
        IMember newUser = ApplicationContext.Current.Services.MemberService.CreateMember (email, email, name, typeAlias);
        try {
            ApplicationContext.Current.Services.MemberService.Save (newUser);
            ApplicationContext.Current.Services.MemberService.SavePassword (newUser, pw);
            ApplicationContext.Current.Services.MemberService.AssignRole (newUser.Id, groupName);
            userId = newUser.Id;
        }
        catch (Exception ex) {
            throw new Exception ("Unable to create new member " + ex.Message);
        }
    }
    return userId;
}
