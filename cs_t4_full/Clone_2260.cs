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
    filterContext.HttpContext.Response.SuppressContent = true;
    filterContext.HttpContext.Response.Clear();
    var controllerName = (string) filterContext.Controller.GetType().Name;
    var model = new HandleErrorInfo (filterContext.Exception, "", "");
    filterContext.Exception = null;
    filterContext.Result = new JsonResult {Data = model, JsonRequestBehavior = JsonRequestBehavior.AllowGet};
}


