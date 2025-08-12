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

    if (Guid.TryParse(input, out Guid g))
        return g;
    else {
        byte[] bytes = new byte[16];
        for(int i = 0; i < bytes.Length; i++ ){ 
            int x;
            if (int.TryParse(input[i].ToString(), out x))
                bytes[i] = (byte)x;
            else 
                return null;
        }
        return new Guid(bytes); 
    }
    return null;
}


