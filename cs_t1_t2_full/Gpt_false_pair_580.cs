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


  private static void GetUserData (string userName, UserSession user) {
    using (Entities ctx = CommonSERT.GetContext ())
    {
        var userData = (from ur in ctx.datUserRoles
                where ur.AccountName.Equals (userName, StringComparison.CurrentCultureIgnoreCase)
                select new {Active = ur.Active, ID = ur.ID})
        		.FirstOrDefault();
        if (userData != null)
            user.UserActive = userData.Active;
        user.UserID = userData.ID;
    }
}
