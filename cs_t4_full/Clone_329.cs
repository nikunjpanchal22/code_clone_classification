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
        string currentUserId = _userManager.GetUserId(User);
        long stakeholderId;
        var userId = _userManager.Users.Where(x => x.Email == currentUserId).Select(x => x.Id).FirstOrDefault();
        if (userId != 0)
        {
            stakeholderId = _context.Stakeholders.Where(x => x.IdentityId == userId).Select(x => x.StakeholderId).FirstOrDefault();
        }
        return stakeholderId;
    }

 private long GetStakeholderId()
    {
        string currentUserId = _userManager.GetUserId(User);
        long stakeholderId;
        var userId = _userManager.Users.Where(x => x.Email == currentUserId).Select(x => x.Id).ToList();
        if (userId.Any())
        {
            stakeholderId = _context.Stakeholders.Where(x => userId.Contains(x.IdentityId)).Select(x => x.StakeholderId).FirstOrDefault();
            return stakeholderId;
        }
        return 0;
    }

 private long GetStakeholderId () {
    string currentUserId = _userManager.GetUserId(User);
    var userId = _context.Users.FirstOrDefault(u => u.Email == currentUserId)?.Id;
    if (userId != null) 
    {
        return _context.Stakeholders.FirstOrDefault(s => s.IdentityId == userId)?.StakeholderId ?? 0;
    }
    
    return 0;
}


