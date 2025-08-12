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
        Action<object> captureExceptionAndThrowIt = ex =>
        {
            ExceptionDispatchInfo.Capture(ex).Throw();
        };
        try
        {
            try
            {
                captureExceptionAndThrowIt(CallAndThrow());
            }
            catch (Exception ex)
            {
                captureExceptionAndThrowIt(ex);
            }
        }
        catch (Exception ex)
        {
            captureExceptionAndThrowIt(ex);
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


