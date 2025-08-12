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


  private long GetStakeholderId() {
    long stakeholderId = 0;
    string currentUserId = _userManager.GetUserId(User);
    var users = _userManager.Users.Where(u => u.Email == currentUserId).ToList();
    if (users.Count > 0) {
        var idForStakeholder = users[0].Id;
        var stakeholder = _context.Stakeholders.FirstOrDefault(s => s.IdentityId == idForStakeholder);
        if (stakeholder != null) {
            stakeholderId = stakeholder.StakeholderId;
        }
    }
    return stakeholderId;
}


