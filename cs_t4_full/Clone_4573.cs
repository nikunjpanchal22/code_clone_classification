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


 public static bool IsQueueAvailable (string queueName) {
    try {
        var queue = new MessageQueue (queueName);
        queue.Peek (TimeSpan.FromSeconds (5));
        return true;
    }
    catch (ArgumentException) {
        return false;
    }
    catch (MessageQueueException ex) {
        return (ex.MessageQueueErrorCode == MessageQueueErrorCode.IOTimeout);
    }
}


