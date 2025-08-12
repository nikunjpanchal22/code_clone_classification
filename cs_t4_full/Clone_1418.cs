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


 public void SetIndex(int index)
{
    lock (syncLock)
    {
        if(entries[index].IsSet) 
        {
            throw new InvalidOperationException ();
        }
        else
        {
            entries[index].IsSet = true;
            entries[index].HandlerCount++;
        }
    }
    Action[] handlerList = entries[index].HandlerList;
    for (int i = 0; i < entries[index].HandlerCount; i++) 
    {
        handlerList[i]();
    }

}


