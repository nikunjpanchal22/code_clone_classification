public object BindModel (ControllerContext controllerContext, ModelBindingContext bindingContext) {
    if (! controllerContext.HttpContext.Request.ContentType.StartsWith ("application/json", StringComparison.OrdinalIgnoreCase)) {
        return null;
    }
    var inpStream = controllerContext.HttpContext.Request.InputStream;
    inpStream.Seek (0, SeekOrigin.Begin);
    StreamReader reader = new StreamReader (controllerContext.HttpContext.Request.InputStream);
    string bodyText = reader.ReadToEnd ();
    reader.Close ();
    if (String.IsNullOrEmpty (bodyText)) {
        return null;
    }
    return JsonValue.Parse (bodyText);
}


 public object BindModel (ControllerContext controllerContext, ModelBindingContext bindingContext) {
    if (! controllerContext.HttpContext.Request.ContentType.StartsWith ("application/json", StringComparison.OrdinalIgnoreCase))
        return null;
    
    using (var streamReader = new StreamReader(controllerContext.HttpContext.Request.InputStream))
    {
        string requestBody;
        if (streamReader.Peek() == -1)
            return null;
        else
            requestBody = streamReader.ReadToEnd();

        if (string.IsNullOrWhiteSpace(requestBody))
            return null;

        var result = JObject.Parse(requestBody).ToObject<object>();
        return result;
     }
}


