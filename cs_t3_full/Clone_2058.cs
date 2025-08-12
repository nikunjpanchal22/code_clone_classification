protected void Application_Error (object sender, EventArgs e) {
    Exception exception = Server.GetLastError () as Exception;
    if (exception != null) {
        Context.ClearError ();
        Context.Response.TrySkipIisCustomErrors = true;
        string path = (exception is HttpException && (exception as HttpException).GetHttpCode () == 404) ? "~/Error/NotFound?errorMessage=" + exception.Message : "~/Error/Index?errorMessage=" + exception.Message;
        Context.Server.TransferRequest (path, false);
    }
}




protected void Application_Error(object sender, EventArgs e)
{
    var exception = Server.GetLastError() as Exception;
    if (exception is HttpException httpException)
    {
        Context.ClearError();
        Context.Response.TrySkipIisCustomErrors = true;
        string path = httpException.GetHttpCode() == 404 ? "~/Error/NotFound?errorMessage=" : "~/Error/Index?errorMessage=";
        path += httpException.Message;
        Context.Server.TransferRequest(path, false);
    }
}


