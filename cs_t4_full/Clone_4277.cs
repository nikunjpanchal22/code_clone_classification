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
        using (Entities db = new Entities()) {
            var result = db.datUserRoles
                .SingleOrDefault(x => x.AccountName.Equals(userName, StringComparison.CurrentCultureIgnoreCase));

            if (result != null)
                user.UserActive = result.Active;
            user.UserID = result.ID;
        }
    }

 private static void GetUserData (string userName, UserSession user) {
    using (var dbContext = CommonSERT.GetContext ())
    {
        var result = dbContext.datUserRoles.Where(x => x.AccountName == userName).Select(x => new {Active = x.active, ID = x.ID, })
            .FirstOrDefault();
        if (result != null)
        {
            user.UserActive = result.Active;
        }

        user.UserID = result.ID;
    }
}


