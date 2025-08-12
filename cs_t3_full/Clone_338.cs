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
        Func<object, Exception> captureAndThrow = ex =>
        {
            ExceptionDispatchInfo.Capture(ex).Throw();
            return ex;
        };
        try
        {
            try
            {
                captureAndThrow(CallAndThrow());
            }
            catch (Exception ex)
            {
                captureAndThrow(ex);
            }
        }
        catch (Exception ex)
        {
            captureAndThrow(ex);
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


