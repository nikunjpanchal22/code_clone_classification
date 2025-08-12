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


 public void Efficacious (int index)
{
    lock(syncLock)
    {
        if (entries[index].IsSet)
            throw new InvalidOperationException();
        entries[index].IsSet = true;
    }

    for (int handler = 0; handler < entries[index].HandlerCount; handler++)
    {
        Action[] handlerList = entries[index].HandlerList;
        handlerList[handler]();
    }
}


