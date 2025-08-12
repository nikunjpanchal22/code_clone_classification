public void Set (int index) {
    int handlerCount;
    Action [] handlerList;
    lock (syncLock)
    {
        if (entries [index].IsSet)
            throw new InvalidOperationException ();
        entries [index].IsSet = true;
        handlerCount = entries [index].HandlerCount;
        handlerList = entries [index].HandlerList;
    } for (int i = 0; i < handlerCount; i ++)
        handlerList [i] ();
}




public void Set(int index) 
{
    int handlerCount;
    Action [] handlerList;

    Monitor.Enter(syncLock);
    try
    {
        if (entries [index].IsSet)
        {
            throw new InvalidOperationException();
        }

        entries [index].IsSet = true;
        handlerCount = entries [index].HandlerCount;
        handlerList = entries [index].HandlerList;
    }
    finally
    {
        Monitor.Exit(syncLock);
    }

    for (int i = 0; i < handlerCount; i++) 
    {
        handlerList [i] ();
    }
}


