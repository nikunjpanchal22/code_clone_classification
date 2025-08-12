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
		ExecuteAction(CallAndThrow);
	    }
	    catch (Exception ex)
	    {
		Console.WriteLine(ex.ToString());
	    }
	}

	static void ExecuteAction(Action action)
	{
	    try
	    {
		action();
	    }
	    catch (Exception ex)
	    {
		throw new Exception("An error occurred", ex);
	    }
}


