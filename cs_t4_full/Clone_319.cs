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
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
    return 0;
}



 private long GetStakeholderId()
{
    string currentUserId = _userManager.GetUserId (User);
    long stakeholderId;
    var users = _userManager.Users;
    
    // For each user in the list of users managed by the user manager
    for (int index = 0; index < users.Count; index++)
    {
        // If the user's email matches the current user's
        if (users[index].Email == currentUserId)
        {
            // Set the identity ID for the current user 
            var idForStakeholder = users[index].Id;
            var stakeholders = _context.Stakeholders;

            // For each stakeholder in the list of stakeholders managed by the context
            for (int i = 0; i < stakeholders.Count; i++)
            {
                // If the stakeholder's identity ID matches the current user's identity ID
                if (stakeholders[i].IdentityId == idForStakeholder)
                {
                    // Set the stakeholder ID for the current stakeholder
                    stakeholderId = stakeholders[i].StakeholderId;
                    return stakeholderId;
                }
            }
            break;
        }
    }
    return 0;
}


