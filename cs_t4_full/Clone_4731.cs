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
    if (! controllerContext.HttpContext.Request.ContentType.StartsWith ("application/json", StringComparison.OrdinalIgnoreCase)) {
        return null;
    }

    Stream stream = controllerContext.HttpContext.Request.InputStream;
    StreamReader reader = new StreamReader(stream);
    string bodyText = reader.ReadToEndAsync().Result;
    if (String.IsNullOrEmpty(bodyText)) {
        return null;
    }
    reader.Dispose();
    stream.Dispose();

    Newtonsoft.Json.Linq.JObject obj = Newtonsoft.Json.Linq.JObject.Parse(bodyText);
    if (obj == null)
    {
        return null;
    }

    return obj.ToObject<object>();
}


