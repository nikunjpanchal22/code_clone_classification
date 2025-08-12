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


 public void Set (int index) {
    if (!Monitor.TryEnter(syncLock))
    {
        throw new InvalidOperationException ();
    }

    try
    {
        if (entries [index].IsSet)
            throw new InvalidOperationException ();
        entries [index].IsSet = true;
    }
    finally
    {
        Monitor.Exit(syncLock);
    }

    int handlerCount = entries[index].HandlerCount;
    Action [] handlerList = entries[index].HandlerList;

    for (int i = 0; i < handlerCount; i ++)
        handlerList [i] (); 
}


