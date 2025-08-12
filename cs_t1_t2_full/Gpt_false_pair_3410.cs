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


[RequireHttps] [HttpPost] public ActionResult SignIn (SignInModel model, string returnUrl) {
    if (ModelState.IsValid) {
        MemberProfile profile = MemberProfile.GetMemberProfile (model.Username);
        if (profile != null && ! profile.IsLockedOut) {
            if (Services.VerifyUser (model.Username, model.Password)) {
                AuthorisationService.SignIn (model.Username, model.RememberMe);
            } else {
                ModelState.AddModelError ("", "The user name or password provided is incorrect.");
            }
        } else {
            ModelState.AddModelError ("", "The user account does not exist or has been locked out.");
        }
    }
    return View (model);
}
