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
        // Check if the policy exists
        if(context.Policies.ContainsKey(LoggerExtension.LoggerBuildKey))
        {
            // Get the existing policy
            var loggerPolicy = context.Policies.Get<ILoggerPolicy>(LoggerExtension.LoggerBuildKey);
            loggerPolicy.Push(context.BuildKey.Type);
        }
        else // Create a new policy if the policy does not exist
        {
            var loggerPolicy = new LoggerPolicy();
            context.Policies.Set<ILoggerPolicy>(loggerPolicy, LoggerExtension.LoggerBuildKey);
            loggerPolicy.Push(context.BuildKey.Type);
        }
    }
}


