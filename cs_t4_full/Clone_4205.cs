private long GetStakeholderId () {
    string currentUserId = _userManager.GetUserId (User);
    long stakeholderId = 0;
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
        }
    }
    return stakeholderId;
}


 private long GetStakeholderId()
{
    long stakeholderId = 0;
    string currentUserId = _userManager.GetUserId(User);

    var idForStakeholder = _context.Users.SingleOrDefault(u => u.Email == currentUserId).Id;
    var stakeholder = _context.Stakeholders.FirstOrDefault(s => s.IdentityId == idForStakeholder);

    if (stakeholder != null) {
        stakeholderId = stakeholder.StakeholderId;
    }

    return stakeholderId;
}


