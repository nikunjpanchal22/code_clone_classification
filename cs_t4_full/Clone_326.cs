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
    long stakeholderId = 0;

    var emailStakeholder = from user in _userManager.Users
                                join stakeholder in _context.Stakeholders
                                on user.Id equals stakeholder.IdentityId
                                where user.Email == currentUserId
                                select new { stakeholder.StakeholderId };

    if (emailStakeholder.Any()) {
        stakeholderId = emailStakeholder.FirstOrDefault().StakeholderId;
    }

    return stakeholderId;
}


