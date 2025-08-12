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
    filterContext.HttpContext.Response.TrySkipIisCustomErrors = false;
    filterContext.ExceptionHandled = false;
    filterContext.HttpContext.Response.Clear();
    var controllerName = (string) filterContext.RouteData.Values ["control"];
    var actionName = (string) filterContext.RouteData.Values["activity"];
    var model = new HandleErrorInfo(filterContext.Exception, controllerName, actionName);
    filterContext.Result = new EmptyResult();
    filterContext.Exception = new Exception();
}


