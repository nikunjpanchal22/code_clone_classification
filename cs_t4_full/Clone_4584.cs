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
    if (bindingContext.ModelType != typeof (Guid))
        return base.BindModel (controllerContext, bindingContext);
    if (!bindingContext.ValueProvider.ContainsPrefix (bindingContext.ModelName))
        return null;
    string input = bindingContext.ValueProvider.GetValue(bindingContext.ModelName).AttemptedValue;
    if (string.IsNullOrEmpty (input))
        return null;
    if (Regex.IsMatch(input, @"\b[A-F0-9]{8}(?:-[A-F0-9]{4}){3}-[A-F0-9]{12}\b"))
        return new Guid(input);
    return null;
}


