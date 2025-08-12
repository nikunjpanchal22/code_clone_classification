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
    
    stakeholderId = _context
        .Stakeholders
        .Where(s => s.IdentityId == currentUserId)
        .Select(s => s.StakeholderId)
        .SingleOrDefault(); 

    return stakeholderId;
}


