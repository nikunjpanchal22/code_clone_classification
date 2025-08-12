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






public static bool IsQueueAvailable(string queueName)
{
    var mq = new MessageQueue(queueName);
    try
    {
        var msg = mq.Peek(new TimeSpan(0, 0, 5));
        return true;
    }
    catch (System.Messaging.MessageQueueException mqe) when (mqe.MessageQueueErrorCode == MessageQueueErrorCode.IOTimeout)
    {
        return false;
    }
}


