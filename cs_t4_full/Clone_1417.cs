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


 public void Execute(int index)
{
    lock(syncLock)
    {
        if (entries[index].IsSet)
            throw new InvalidOperationException();
        entries[index].IsSet = true;
    }

    Action[] handlerList = entries[index].HandlerList;
    int handlerCount = entries[index].HandlerCount;
 
    for (int i = 0; i < handlerCount; i++)
    {
        Action handler = handlerList[i];
        handler();
    }

}


