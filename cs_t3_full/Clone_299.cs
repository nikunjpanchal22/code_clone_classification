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
                }
            }
            return 0;
        }
    }
    return 0;
}


  private long GetStakeholderId () {
    string currentUserId = _userManager.GetUserId (User);
    long stakeholderId;
    var users = _userManager.Users;
    var stakeholders = _context.Stakeholders;
    foreach (var user in users)
    {
        foreach(var stakeholder in stakeholders)
        {
            if (user.Email == currentUserId && stakeholder.IdentityId == user.Id) {
                stakeholderId = stakeholder.StakeholderId;
                return stakeholderId;
            }
        }
    }
    return 0;
}


