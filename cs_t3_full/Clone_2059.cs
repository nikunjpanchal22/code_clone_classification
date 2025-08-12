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
    if (Server.GetLastError() is Exception exception)
    {
        Context.ClearError();
        Context.Response.TrySkipIisCustomErrors = true;
        string path = (exception is HttpException httpException && httpException.GetHttpCode() == 404) ?
            "~/Error/NotFound?errorMessage=" + HttpUtility.UrlEncode(exception.Message) :
            "~/Error/Index?errorMessage=" + HttpUtility.UrlEncode(exception.Message);

        Context.Server.TransferRequest(path, false);
    }
}


