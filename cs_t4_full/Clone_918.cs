public override void PreBuildUp (IBuilderContext context) {
    if (context.BuildKey.Type != typeof (Logger)) {
        var loggerPolicy = context.Policies.Get < ILoggerPolicy > (LoggerExtension.LoggerBuildKey);
        if (loggerPolicy == null) {
            loggerPolicy = new LoggerPolicy ();
            context.Policies.Set < ILoggerPolicy > (loggerPolicy, LoggerExtension.LoggerBuildKey);
        }
        loggerPolicy.Push (context.BuildKey.Type);
    }
}


  public override void PreBuildUp(IBuilderContext context)
{
    if(context.BuildKey.Type != typeof(Logger))
    {
        if(!context.Policies.ContainsKey(LoggerExtension.LoggerBuildKey))
        {
            context.Policies.Set<ILoggerPolicy>(new LoggerPolicy(), LoggerExtension.LoggerBuildKey);
        }
        context.Policies.Get<ILoggerPolicy>(LoggerExtension.LoggerBuildKey).Push(context.BuildKey.Type);
    }
}


