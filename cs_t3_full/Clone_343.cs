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
        Action<object> captureAndThrowIt = ex =>
        {
            ExceptionDispatchInfo.Capture(ex).Throw();
        };
        try
        {
            try
            {
                captureAndThrowIt(CallAndThrow());
            }
            catch (Exception ex)
            {
                captureAndThrowIt(ex);
            }
        }
        catch (Exception ex)
        {
            captureAndThrowIt(ex);
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


