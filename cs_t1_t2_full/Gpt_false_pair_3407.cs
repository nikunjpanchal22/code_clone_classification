[RequireHttps] [HttpPost] public ActionResult LogOn (LogOnModel model, string returnUrl) {
    if (ModelState.IsValid) {
        UserProfile profile = UserProfile.GetUserProfile (model.UserName);
        if (profile != null && ! profile.IsLockedOut) {
            if (MembershipService.ValidateUser (model.UserName, model.Password)) {
                FormsService.SignIn (model.UserName, model.RememberMe);
            } else {
                ModelState.AddModelError ("", "The user name or password provided is incorrect.");
            }
        } else {
            ModelState.AddModelError ("", "The user account does not exist or has been locked out.");
        }
    }
    return View (model);
}


[RequireHttps] [HttpPost] public ActionResult Login (LoginModel model, string returnUrl) {
    if (ModelState.IsValid) {
        UserAccount account = UserAccount.GetUserAccount (model.Username);
        if (account != null && ! account.IsLockedOut) {
            if (AuthenticationService.ValidateUser (model.Username, model.Password)) {
                SessionsService.SignIn (model.Username, model.RememberMe);
            } else {
                ModelState.AddModelError ("", "The user name or password provided is incorrect.");
            }
        } else {
            ModelState.AddModelError ("", "The user account does not exist or has been locked out.");
        }
    }
    return View (model);
}
