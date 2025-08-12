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
    var userId = _userManager.Users.FirstOrDefault(u => u.Email == currentUserId)?.Id;
    if (userId != null) {
        var stakeholderId1 = _context.Stakeholders.Where(s => s.IdentityId == userId)
            .Select(s => s.StakeholderId);
        if (stakeholderId1.Any()) {
            stakeholderId = stakeholderId1.First();
        }
    }
    return stakeholderId;
}


