public override void OnAuthorization (AuthorizationContext filterContext) {
    if (filterContext == null) {
        throw new ArgumentNullException ("filterContext");
    }
    if (AuthorizeCore (filterContext.HttpContext)) {
        SetCachePolicy (filterContext);
    } else if (! filterContext.HttpContext.User.Identity.IsAuthenticated) {
        filterContext.Result = new HttpUnauthorizedResult ();
    } else if (filterContext.HttpContext.User.IsInRole ("SuperUser")) {
        SetCachePolicy (filterContext);
    } else {
        ViewDataDictionary viewData = new ViewDataDictionary ();
        viewData.Add ("Message", "You do not have sufficient privileges for this operation.");
        filterContext.Result = new ViewResult {MasterName = this.MasterName, ViewName = this.ViewName, ViewData = viewData};
    }
}


public override void OnAuthorization (AuthorizationContext filterContext) {
    if (filterContext == null) {
        throw new ArgumentNullException ("filterContext");
    }
    if (AuthorizeCore (filterContext.HttpContext)) {
        SetCachePolicy (filterContext);
    } else if (! filterContext.HttpContext.User.Identity.IsAuthenticated) {
        filterContext.Result = new HttpUnauthorizedResult ();
    } else if (filterContext.HttpContext.User.IsInRole ("Assistant")) {
        SetCachePolicy (filterContext);
    } else {
        ViewDataDictionary viewData = new ViewDataDictionary ();
        viewData.Add ("Message", "Not enough privileges for the current action.");
        filterContext.Result = new ViewResult {MasterName = this.MasterName, ViewName = this.ViewName, ViewData = viewData};
    }
}
