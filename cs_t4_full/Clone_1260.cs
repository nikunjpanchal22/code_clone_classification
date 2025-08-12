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


  public object BindModel(ControllerContext controllerContext, ModelBindingContext bindingContext)
{
    if (!controllerContext.HttpContext.Request.ContentType.StartsWith("application/json", StringComparison.OrdinalIgnoreCase))
    {
        return null;
    }

    var buffer = new char[controllerContext.HttpContext.Request.ContentLength];
    var byteOffset = 0;
    var byteCount = controllerContext.HttpContext.Request.InputStream.Read(buffer, byteOffset, buffer.Length);

    if (byteCount > 0)
    {
        var bodyText = new string(buffer);

        return JsonValue.Parse(bodyText);
    }

    return null;
}


