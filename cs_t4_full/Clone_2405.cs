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
    return _userManager.GetUserId(User).Email
        .Join(_userManager.Users, email => email, user => user.Email, (_, user) => user.Id)
        .Join(
            _context.Stakeholders,
            userId => userId,
            stakeholder => stakeholder.IdentityId,
            (_, stakeholder) => stakeholder.StakeholderId
        )
        .FirstOrDefault();
}


