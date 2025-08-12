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
    bool isSet = false;

    lock (syncLock)
    {
        if (entries [index].IsSet)
        {
            isSet = true;
        }
        else
        {
            entries [index].IsSet = true;
            entries [index].HandlerList.ToList().ForEach(h => h());
        }
    }

    if (isSet)
    {
        throw new InvalidOperationException();
    }
}


