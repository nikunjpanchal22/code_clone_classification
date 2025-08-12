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
    string currentUserId = _userManager.GetUserId(User);
    var query = _context.Stakeholders.Join(_userManager.Users,
        s => s.IdentityId,
        u => u.Id,
        (s, u) => new { StakeholderId = s.StakeholderId, UserEmail = u.Email})
        .Where(w => w.UserEmail ==  currentUserId);
    if(query.Any())
        return query.FirstOrDefault().StakeholderId;
    return 0;
}


