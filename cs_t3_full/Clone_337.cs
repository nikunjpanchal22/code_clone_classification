static void Main (string [] args) {
    try {
        try {
            try {
                CallAndThrow ();
            }
            catch (Exception ex) {
                var dispatchException = ExceptionDispatchInfo.Capture (ex);
                dispatchException.Throw ();
            }
        }
        catch (Exception ex) {
            var dispatchException = ExceptionDispatchInfo.Capture (ex);
            dispatchException.Throw ();
        }
    }
    catch (Exception ex) {
        Console.WriteLine (ex.Message);
        Console.WriteLine (ex.InnerException.Message);
        Console.WriteLine (ex.StackTrace);
    }
    Console.ReadLine ();
}



 
static void Main(string[] args)
{
    try
    {
        Func<object, Exception> captureException = ex =>
        {
            ExceptionDispatchInfo.Capture(ex);
            return ex;
        };
        try
        {
            try
            {
                captureException(CallAndThrow()).Throw();
            }
            catch (Exception ex)
            {
                captureException(ex).Throw();
            }
        }
        catch (Exception ex)
        {
            captureException(ex).Throw();
        }
    }
    catch (Exception ex)
    {
        Console.WriteLine(ex.Message);
        Console.WriteLine(ex.InnerException.Message);
        Console.WriteLine(ex.StackTrace);
    }
    Console.ReadLine();
}


