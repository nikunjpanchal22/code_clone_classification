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
    try 
    {
        stakeholderId = (from user in _userManager.Users
        join stakeholder in _context.Stakeholders
        on user.Id equals stakeholder.IdentityId
        where user.Email == currentUserId
        select stakeholder.StakeholderId).FirstOrDefault();
    }
    catch (Exception) 
    {
        return 0;   
    } 
    return stakeholderId;

}


