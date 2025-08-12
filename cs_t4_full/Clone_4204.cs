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
    var user = _userManager.Users.Where(x => x.Email == currentUserId).FirstOrDefault();
    if(user != null){
        var stakeholder = _context.Stakeholders
            .Where(x => x.IdentityId == user.Id)
            .Select(x => x.StakeholderId).FirstOrDefault();
            return stakeholder ?? 0;
    }
    return 0;
}


