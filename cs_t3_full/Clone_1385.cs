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


  public void Execute (IServiceProvider serviceProvider) 
{
    try
    {
        OnExecute (serviceProvider);
    }
    catch (Exception ex)
    {
        OnError(ex);

        if (ex.InnerException != null)
        {
            throw ex;
        }
    }
    finally
    {
        OnCleanup();
    }
}


