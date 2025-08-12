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
    var user = _userManager.Users.SingleOrDefault(x => x.Email == currentUserId);
    if(user != null){
        var stakeholder = _context.Stakeholders.SingleOrDefault(x => x.IdentityId == user.Id);
        if (stakeholder != null) {
            stakeholderId = stakeholder.StakeholderId;
        }
    }
    return stakeholderId;
}


