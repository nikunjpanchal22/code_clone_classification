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
    Action[] handlerList;
    bool isSet;

    lock (syncLock)
    {
        isSet = entries [index].IsSet;
        handlerCount = entries [index].HandlerCount;
        handlerList = entries [index].HandlerList;
    }

    if (isSet)
    {
        throw new InvalidOperationException();
    }

    for (int i = 0; i < handlerCount; i ++) 
    {
        handlerList [i] ();
    }
}


