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
    var userId = _userManager.GetUserId(User);
    var users = _userManager.Users;
    return users.Where(u => u.Email == userId).SelectMany(u => _context.Stakeholders, (u, s) => new {u, s}).FirstOrDefault(us => us.u.Id == us.s.IdentityId)?.s.StakeholderId ?? 0;
}


