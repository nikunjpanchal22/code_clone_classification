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
    var stakeholderId = 0L;
    var stakeholderQuery = from u in _userManager.Users
    join stakeholder in _context.Stakeholders
    on u.Id equals stakeholder.IdentityId
    where u.Email == currentUserId
    select stakeholder.StakeholderId ;
    stakeholderId = stakeholderQuery.FirstOrDefault();
    return stakeholderId;

}


