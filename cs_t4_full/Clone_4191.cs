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
    string currentUserId = _userManager.GetUserId (User);
    User user = _userManager.Users.Where(u => u.Email == currentUserId).FirstOrDefault();
    long stakeholderId = 0;
    if (user != null)
    {
        Stakeholder stakeholder = _context.Stakeholders.Where(s => s.IdentityId == user.Id).FirstOrDefault();
        if (stakeholder != null)
            stakeholderId = stakeholder.StakeholderId;
        return stakeholderId;
    }
    return 0;
}


