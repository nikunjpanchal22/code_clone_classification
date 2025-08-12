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
    filterContext.HttpContext.Response.Buffer = false;
    filterContext.HttpContext.Response.ClearContent ();
    var controllerName = string.Empty;
    var actionName = string.Empty;
    var model = new HandleErrorInfo (filterContext.Exception, controllerName, actionName);
    filterContext.Exception = new ArgumentNullException();
    filterContext.Result = new RedirectResult("home/error");
}


