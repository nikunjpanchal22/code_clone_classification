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
    string userId = _userManager.GetUserId(User);
    long stakeholderId = _userManager.Users
                        .Where(w => w.Email == userId)
                        .Select(s => s.Id)
                        .Join(_context.Stakeholders, 
                             u => u, 
                             s => s.IdentityId,
                             (u, s) => s.StakeholderId)
                        .FirstOrDefault();
    return stakeholderId;
}


