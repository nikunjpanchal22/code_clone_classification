public void ProcessRequest (HttpContext context) {
    ClearResponse (context);
    switch (context.Request.HttpMethod.ToUpper ()) {
        case "OPTIONS" :
            SetAllowCrossSiteRequestHeaders (context);
            SetAllowCrossSiteRequestOrigin (context);
            context.Response.End ();
            break;
        default :
            context.Response.Headers.Add ("Allow", "OPTIONS");
            context.Response.StatusCode = 405;
            break;
    }
    context.ApplicationInstance.CompleteRequest ();
}


public void ProcessRequest (HttpContext context) {
    ClearResponse (context);
    switch (context.Request.HttpMethod.ToUpper ()) {
        case "POST" :
            SetAllowCrossSiteRequestHeaders (context);
            SetAllowCrossSiteRequestOrigin (context);
            context.Response.End ();
            break;
        default :
            context.Response.Headers.Add ("Allow", "POST");
            context.Response.StatusCode = 405;
            break;
    }
    context.ApplicationInstance.CompleteRequest ();
}
