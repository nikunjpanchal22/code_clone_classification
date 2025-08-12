private static void GetUserData (string userName, UserSession user) {
    using (Entities ctx = CommonSERT.GetContext ())
    {
        var result = (from ur in ctx.datUserRoles
            where ur.AccountName.Equals (userName, StringComparison.CurrentCultureIgnoreCase)
            select new {Active = ur.active, ID = ur.ID,}).FirstOrDefault ();
        if (result != null)
            user.UserActive = result.Active;
        user.UserID = result.ID;
    }}


#====================
#gpt output=============

//Type 3
private static void GetUserData(string userName, UserSession user)
{
    using(Entities ctx = CommonSERT.GetContext())
    {
        var result = (from r in ctx.datUserRoles
            where r.AccountName.Equals(userName, StringComparison.CurrentCultureIgnoreCase)
            select new{Active = r.active, Role = r.Role, ID = r.ID}).FirstOrDefault();
        if(result != null)
        {
            user.UserActive = result.Active;
            user.UserRole = result.Role;
            user.UserID = result.ID;
        }
    }
}


private static void GetUserData(string userName, UserSession user)
{
    using(Entities ctx = CommonSERT.GetContext())
    {
        var result = (from r in ctx.datUserRoles
            where r.AccountName.Equals(userName, StringComparison.CurrentCultureIgnoreCase)
            select new{Active = r.active, Role = r.Role, ID = r.ID}).FirstOrDefault();
        if(result != null)
        {
            user.UserActive = result.Active;
            user.UserRole = result.Role;
            user.UserID = result.ID;
        }
    }
}
