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


 private long GetStakeholderId () {
    string currentUserId = _userManager.GetUserId (User);
    long stakeholderId = 0;
    var users = _userManager.Users.Where(u => u.Email == currentUserId).ToList();
    if (users.Count > 0)
    {
        var idForStakeholder = users[0].Id;
        var stakeholders = _context.Stakeholders.Where(s => s.IdentityId == idForStakeholder).ToList();
        if(stakeholders.Count > 0)
        {
            stakeholderId = stakeholders[0].StakeholderId;
        }
    }
    return stakeholderId;
}


