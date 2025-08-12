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


  public int RegisterUser (string memberName, string emailAddress, string memberPassword, string memberTypeAlias, string memberGroupAlias) {
    int umbracoUserId = -1;
    if (! UserExists (emailAddress)) {
        IMember newUser = ApplicationContext.Current.Services.MemberService.CreateMember (memberName, emailAddress, memberPassword, memberTypeAlias);
        try {
            ApplicationContext.Current.Services.MemberService.Save (newUser);
            ApplicationContext.Current.Services.MemberService.SavePassword (newUser, memberPassword);
            ApplicationContext.Current.Services.MemberService.AssignStatus (newUser.Id, memberGroupAlias);
            umbracoUserId = newUser.Id;
        }
        catch (Exception ex) {
            throw new Exception ("Unable to create new user " + ex.Message);
        }
    }
    return umbracoUserId;
}
