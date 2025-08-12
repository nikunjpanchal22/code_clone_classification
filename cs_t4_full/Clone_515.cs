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


 [RequireHttps] [HttpPost] public ActionResult LogOn (LogOnModel model, string returnUrl) 
{
    if (!ModelState.IsValid)
        return View(model);

    UserProfile profile = UserProfile.GetUserProfile(model.UserName);
    if (profile == null || profile.IsLockedOut)
    {
        if (profile == null)
            ModelState.AddModelError("", "The user account does not exist or has been locked out.");
        else
            ModelState.AddModelError("", "The user account has been locked out.");

        return View(model);
    }

    if (!MembershipService.ValidateUser(model.UserName, model.Password))
    {
        ModelState.AddModelError("", "The user name or password provided is incorrect.");
        return View(model);
    }

    FormsService.SignIn(model.UserName, model.RememberMe);
    return View(model);
}


