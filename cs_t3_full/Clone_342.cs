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
        Func<object, Exception> captureExceptionFuncAndThrow = ex =>
        {
            return ExceptionDispatchInfo.Capture(ex).Throw();
        };
        try
        {
            try
            {
                captureExceptionFuncAndThrow(CallAndThrow());
            }
            catch (Exception ex)
            {
                captureExceptionFuncAndThrow(ex);
            }
        }
        catch (Exception ex)
        {
            captureExceptionFuncAndThrow(ex);
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


