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


 public static string RenderRazorPartialView(string controllerName, string partialView, object model)  
{  
    RouteData routeData = new RouteData();  
    routeData.Values["controller"] = controllerName;  
    controllerName = controllerName.Replace("Controller", string.Empty);  
    using (var controllerContext = new ControllerContext(new RequestContext(new HttpContextWrapper(HttpContext.Current), routeData),  
        System.Reflection.Assembly.GetExecutingAssembly().CreateInstance("Controller." + controllerName + "Controller") as Controller))  
    {  
        controllerContext.RouteData.Values["controller"] = controllerName;  
        var viewData = new ViewDataDictionary(model);  
        viewData.TemplateInfo.HtmlFieldPrefix = controllerName;  
  
        var viewResult = ViewEngines.Engines.FindPartialView(controllerContext, partialView);  
        var razorView = viewResult.View;  
        var sw = new StringWriter();  
        razorView.Render(new ViewContext(controllerContext, razorView, viewData, new TempDataDictionary(), sw), sw);  
        return sw.ToString();  
    }  
}


