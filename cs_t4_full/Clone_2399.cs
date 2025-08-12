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
    var currentUser = User;
    long stakeholderId = _userManager.Users
    .Where(u => u.Email == currentUser.Email)
    .SelectMany(u => _context.Stakeholders, (u, s) => new { u, s })
    .Where(us => us.u.Id == us.s.IdentityId)
    .Select(us => us.s.StakeholderId)
    .FirstOrDefault();
    
    return stakeholderId;
}


