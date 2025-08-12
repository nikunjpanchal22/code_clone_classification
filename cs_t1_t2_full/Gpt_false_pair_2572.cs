public void Execute (IServiceProvider serviceProvider) {
    try {
        OnExecute (serviceProvider);
    }
    catch (Exception ex) {
        bool rethrow = false;
        try {
            OnError (ex);
        }
        catch {
            rethrow = true;
        }
        if (rethrow) {
            throw;
        }
    }
    finally {
        OnCleanup ();
    }
}


public void Execute(IServiceProvider serviceProvider)
{
    try
    {
        OnExecute(serviceProvider);
    }
    catch (Exception ex)
    {
        bool rethrow = false;
        try
        {
            if (ex is ArgumentNullException)
            {
                Console.WriteLine("ArgumentNullException has been thrown.");
            }
            OnError(ex);
        }
        catch
        {
            rethrow = true;
        }
        if (rethrow)
        {
            throw;
        }
    }
    finally
    {
        OnCleanup();
    }
}
