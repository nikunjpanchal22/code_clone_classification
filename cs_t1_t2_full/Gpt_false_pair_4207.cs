void IServiceBehavior.ApplyDispatchBehavior (ServiceDescription description, ServiceHostBase serviceHostBase) {
    IErrorHandler errorHandler;
    try {
        errorHandler = (IErrorHandler) Activator.CreateInstance (errorHandlerType);
    }
    catch (MissingMethodException e) {

#====================
#gpt output=============
	    throw new ArgumentException(
	      "The errorHandlerType specified in the ErrorBehaviorAttribute constructor could not be found.",
			e
	    );
    }
    foreach (ChannelDispatcherBase channelDispatcherBase in serviceHostBase.ChannelDispatchers) {
        ChannelDispatcher channelDispatcher = channelDispatcherBase as ChannelDispatcher;
        channelDispatcher.ErrorHandlers.Add (errorHandler);
    }
}


void IServiceBehavior.ApplyDispatchBehavior (ServiceDescription description, ServiceHostBase serviceHostBase) {
    IErrorHandler errorHandler;
    try {
        errorHandler = errorHandlerType.GetConstructors().FirstOrDefault().Invoke() as IErrorHandler;
    }
    catch (MissingMethodException e) {
	    throw new ArgumentException(
	      "The errorHandlerType specified in the ErrorBehaviorAttribute constructor could not be found.",
			e
	    );
    }
    foreach (ChannelDispatcherBase channelDispatcherBase in serviceHostBase.ChannelDispatchers) {
        ChannelDispatcher channelDispatcher = channelDispatcherBase as ChannelDispatcher;
        channelDispatcher.ErrorHandlers?.Add (errorHandler);
    }
}
