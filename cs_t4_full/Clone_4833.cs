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


 public async void Set (int index)
{
    if (entries [index].IsSet)
        throw new InvalidOperationException ();

    await Task.Run(() =>
    {
        lock (syncLock)
            entries [index].IsSet = true;
    });

    int handlerCount = entries[index].HandlerCount;
    Action [] handlerList = entries[index].HandlerList;

    for (int i = 0; i < handlerCount; i ++)
        handlerList [i] ();
}


