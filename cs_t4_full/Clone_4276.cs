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


 private static void GetUserData(string username, UserSession user) 
{
    Entities context = CommonSERT.GetContext();

    var query = from ur in context.datUserRoles
                where ur.AccountName.Equals(username, StringComparison.CurrentCultureIgnoreCase)
                select new {Active = ur.active, ID = ur.ID,};
    
    var result = query.FirstOrDefault();
    if (result != null)
    {
        user.UserActive = result.Active;
        user.UserID = result.ID;
    }

    context.Dispose();
}


