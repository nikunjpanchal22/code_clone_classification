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
    bool isSet;
    Action[] handlers;
    
    lock (syncLock)
    {
        if (entries[index].IsSet)
        {
            throw new InvalidOperationException();
        }

        entries[index].IsSet = true;
        handlers = entries[index].HandlerList;
    }

    Parallel.ForEach(handlers, handler => handler());
}


