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
    lock (syncLock)
    {
        if (entries [index].IsSet)
        {
            throw new InvalidOperationException();
        }

        entries [index].IsSet = true;
        var handlerList = entries [index].HandlerList;

        foreach (Action handler in handlerList) 
        {
            handler();
        }
    }
}


