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
    string bodyText;
    using (var reader = new System.IO.StreamReader(controllerContext.HttpContext.Request.InputStream))
    {
        bodyText = reader.ReadToEnd();
    }

    if (String.IsNullOrWhiteSpace(bodyText))
    {
        return null;
    }

    var deserializedData = JsonConvert.DeserializeObject(bodyText);
    return deserializedData;
}   

 public object BindModel (ControllerContext controllerContext, ModelBindingContext bindingContext) {
    if (! controllerContext.HttpContext.Request.ContentType.StartsWith ("application/json", StringComparison.OrdinalIgnoreCase))
        return null;

    var req = controllerContext.HttpContext.Request;
    using (var reader = new StreamReader(req.InputStream))
    {
        if (reader.Peek() == -1)
            return null;

        var bodyText = reader.ReadToEnd();
        if (String.IsNullOrWhiteSpace(bodyText))
            return null;

        var jObject = JObject.Parse(bodyText);
        return jObject.ToObject<ExpandoObject>();
    }
}


