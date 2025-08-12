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
    long stakeholderId;
    var user = _userManager.Users.FirstOrDefault(x => x.Email == currentUserId);
    if(user == null){
        return 0;
    }
    var stakeholder = _context.Stakeholders.FirstOrDefault(x => x.IdentityId == user.Id);
    if (stakeholder == null) {
        return 0;
    }
    return stakeholder.StakeholderId;
}


