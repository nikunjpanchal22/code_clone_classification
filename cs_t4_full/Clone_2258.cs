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
    var controllerName = (string)filterContext.ActionDescriptor.ControllerDescriptor.ControllerType.Name;
    var model = new HandleErrorInfo (filterContext.Exception, controllerName, "");
    filterContext.HttpContext.Response.TrySkipIisCustomErrors = true;
    filterContext.ExceptionHandled = true;
    filterContext.Exception = null;
    filterContext.Result = new ViewResult { ViewBag = "Error", ViewData = new ViewDataDictionary<HandleErrorInfo>(model)};
}


