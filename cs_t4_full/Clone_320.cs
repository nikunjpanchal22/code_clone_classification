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
        return 0;
    }
    return 0;
}


 private long GetStakeholderId() {
    string currentUserId = _userManager.GetUserId(User);
    long stakeholderId;
    var users = _context.Users.Where(u => u.Email == currentUserId);
    if (users.Any() && users.Count() > 0) {
        var idForStakeholder = users.FirstOrDefault().Id;
        var stakeholders = _context.Stakeholders.Where(s => s.IdentityId == idForStakeholder);
        if (stakeholders.Any() && stakeholders.Count() > 0) {
            stakeholderId = stakeholders.FirstOrDefault().StakeholderId;
            return stakeholderId;
        } else {
            return 0;
        }
    } 
    return 0;
}


