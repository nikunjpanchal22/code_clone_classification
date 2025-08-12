public override object BindModel (ControllerContext controllerContext, ModelBindingContext bindingContext) {
    if (! (bindingContext.ModelType == typeof (Guid)))
        return base.BindModel (controllerContext, bindingContext);
    if (! bindingContext.ValueProvider.ContainsPrefix (bindingContext.ModelName))
        return null;
    string input = bindingContext.ValueProvider.GetValue (bindingContext.ModelName).AttemptedValue;
    if (string.IsNullOrEmpty (input))
        return null;
    Guid g;
    if (Guid.TryParse (input, out g))
        return g;
    var bytes = HttpServerUtility.UrlTokenDecode (s);
    var result = new Guid (bytes);
    return result;
}


 public override object BindModel (ControllerContext controllerContext, ModelBindingContext bindingContext) {
     if (! (bindingContext.ModelType == typeof (Guid)))
        return base.BindModel (controllerContext, bindingContext);
    if (! bindingContext.ValueProvider.ContainsPrefix (bindingContext.ModelName))
        return null;
    string input = bindingContext.ValueProvider.GetValue (bindingContext.ModelName).AttemptedValue;
    if (string.IsNullOrEmpty (input))
        return null;
    Guid g;
    if (Guid.TryParse (input, out g))
        return g;
    byte[] b = new byte[16];
    int i = 0;
    foreach (char ch in input)
    {
        b[i] = (byte)ch;
        i++;
    }
    var result = new Guid (b);
    return result;
}


