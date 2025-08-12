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
    long StakeholderId = 0;
    string CurrentUserId = _userManager.GetUserId(User);
    var StakeholderEntity = _context
        .Stakeholders
        .Where(e => e.IdentityId == CurrentUserId)
        .FirstOrDefault();

    if (StakeholderEntity != null)
    {
        StakeholderId = StakeholderEntity.StakeholderId;
    }

    return StakeholderId;
}


