public static bool IsQueueAvailable (string queueName) {
    MessageQueue queue;
    try {
        queue = new MessageQueue (queueName);
        queue.Peek (new TimeSpan (0, 0, 5));
        return true;
    }
    catch (Exception ex) {
        if (ex is ArgumentException) {
            return false;
        } else if (ex is MessageQueueException) {
            return (((MessageQueueException) ex).MessageQueueErrorCode == MessageQueueErrorCode.IOTimeout);
        }
        return false;
    }
}


 public static bool IsQueueAvailable (string queueName) 
{
    MessageQueue queue;
    bool flag = false;
    
    try 
    {
        queue = new MessageQueue (queueName);
        
        if (queue.Peek(new TimeSpan (0, 0, 5)) != null)
            flag = true;
        else
            flag = false;
    }
    catch (ArgumentException)
    {
        flag = false;
    }
    catch (MessageQueueException ex)
    {
        if (ex.MessageQueueErrorCode == MessageQueueErrorCode.IOTimeout)
            flag = true;
        else
            flag = false;
    }
    
    return flag;
}


