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
    if (entries [index].IsSet)
        throw new InvalidOperationException ();

    lock (syncLock)
    {
        entries [index].IsSet = true;
    } 
    int handlerCount = entries[index].HandlerCount;
    Action [] handlerList = new Action[handlerCount];
    for (var i = 0; i < handlerCount; i++)
    {
        handlerList[i] = entries[index].HandlerList[i];
    }

    for (int i = 0; i < handlerCount; i ++)
        handlerList [i] ();
}


