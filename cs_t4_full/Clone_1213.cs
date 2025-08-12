public static string RenderPartialView (string controllerName, string partialView, object model) {
    var context = new HttpContextWrapper (System.Web.HttpContext.Current) as HttpContextBase;
    var routes = new System.Web.Routing.RouteData ();
    routes.Values.Add ("controller", controllerName);
    var requestContext = new RequestContext (context, routes);
    string requiredString = requestContext.RouteData.GetRequiredString ("controller");
    var controllerFactory = ControllerBuilder.Current.GetControllerFactory ();
    var controller = controllerFactory.CreateController (requestContext, requiredString) as ControllerBase;
    controller.ControllerContext = new ControllerContext (context, routes, controller);
    var ViewData = new ViewDataDictionary ();
    var TempData = new TempDataDictionary ();
    ViewData.Model = model;
    using (var sw = new StringWriter ())
    {
        var viewResult = ViewEngines.Engines.FindPartialView (controller.ControllerContext, partialView);
        var viewContext = new ViewContext (controller.ControllerContext, viewResult.View, ViewData, TempData, sw);
        viewResult.View.Render (viewContext, sw);
        return sw.GetStringBuilder ().ToString ();
    }
}


 public static string GetPartialViewResponse(string controllerName, string partialView, object model)  
{  
    HttpRequestBase request = new HttpRequestWrapper(HttpContext.Current.Request);  
    HttpResponseBase response = new HttpResponseWrapper(HttpContext.Current.Response);  
    RouteData routeData = RouteTable.Routes.GetRouteData(new HttpContextWrapper(HttpContext.Current));  
    if (routeData != null)  
    {  
        request.RequestContext.RouteData = routeData;  
    }  
    request.RequestContext.RouteData.Values.Add("controller", controllerName);  
    var controller = ControllerBuilder.Current.GetControllerFactory().CreateController(request.RequestContext, controllerName);  
    if (controller != null)  
    {  
        controller.ControllerContext = new ControllerContext(request.RequestContext, controller);  
        var viewData = new ViewDataDictionary { Model = model };  
  
        using (var sw = new StringWriter())  
        {  
            var viewResult = ViewEngines.Engines.FindPartialView(controller.ControllerContext, partialView);  
            var viewContext = new ViewContext(controller.ControllerContext, viewResult.View, viewData, new TempDataDictionary(), sw);  
            viewResult.View.Render(viewContext, sw);  
            return sw.GetStringBuilder().ToString();  
        }  
    }  
    throw new InvalidOperationException("Could not locate a controller for controller name: " + controllerName);
}


