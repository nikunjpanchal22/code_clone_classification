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





private long GetStakeholderId()
{
    string userId = _userManager.GetUserId(User);
    return _context.Stakeholders.FirstOrDefault(s => s.IdentityId == userId)?.StakeholderId ?? 0;
}


