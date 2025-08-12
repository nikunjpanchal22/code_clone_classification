public override void OnException (ExceptionContext filterContext) {
    filterContext.HttpContext.Response.TrySkipIisCustomErrors = true;
    filterContext.ExceptionHandled = true;
    filterContext.HttpContext.Response.ClearContent ();
    var controllerName = (string) filterContext.RouteData.Values ["controller"];
    var actionName = (string) filterContext.RouteData.Values ["action"];
    var model = new HandleErrorInfo (filterContext.Exception, controllerName, actionName);
    filterContext.Result = new ViewResult {ViewName = View, MasterName = Master, ViewData = new ViewDataDictionary < HandleErrorInfo > (model), TempData = filterContext.Controller.TempData};
    filterContext.Exception = null;
}


 

public override void OnException (ExceptionContext filterContext) {
    filterContext.HttpContext.AllErrorsAreHandled = true;
    filterContext.HttpContext.Response.ClearHeaders();
    var actionName = (string) filterContext.RouteData.DataTokens["action"];
    var controllerName = (string) filterContext.RouteData.Values ["controller"];
    var model = new HandleErrorInfo(filterContext.Exception, controllerName, "");
    filterContext.Exception = new ApplicationException();
    filterContext.Result = new RedirectResult("/Home/Error");
}


