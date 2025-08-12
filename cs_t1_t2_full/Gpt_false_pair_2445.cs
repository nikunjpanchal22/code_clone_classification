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



  public int RegisterMember (string userName, string emailAddress, string memberPassword, string memberTypeAlias, string memberGroupAlias) {
    int umbracoUserId = -1;
    if (!UserExists(emailAddress)) {
        IMember newMember = ApplicationContext.Current.Services.MemberService.CreateMember(userName, emailAddress, memberPassword, memberTypeAlias);
        try {
            ApplicationContext.Current.Services.MemberService.Save(newMember);
            ApplicationContext.Current.Services.MemberService.AssignRole(newMember.Id, memberGroupAlias);
            umbracoUserId = newMember.Id;
        }
        catch (Exception ex) {
            throw new Exception("Unable to create new member " + ex.Message);
        }
    }
    return umbracoUserId;
}
