private long GetStakeholderId () {
    string currentUserId = _userManager.GetUserId (User);
    long stakeholderId;
    var users = _userManager.Users;
    foreach (var user in users) {
        if (user.Email == currentUserId) {
            var idForStakeholder = user.Id;
            var stakeholders = _context.Stakeholders;
            foreach (var stakeholder in stakeholders) {
                if (stakeholder.IdentityId == idForStakeholder) {
                    stakeholderId = stakeholder.StakeholderId;
                    return stakeholderId;
                } else {
                    return 0;
                }
            }
        }
    }
    return 0;
}


 private long GetStakeholderId()
{
    User user = _userManager.GetUser(User);
    long stakeholderId = 0;
    if (user != null && user.Email != null)
    {
        Stakeholder stakeholder = _context.Stakeholders.Where(s => s.IdentityId == user.Id).FirstOrDefault();
        if (stakeholder != null)
            stakeholderId = stakeholder.StakeholderId;
    }
    return stakeholderId;
}


