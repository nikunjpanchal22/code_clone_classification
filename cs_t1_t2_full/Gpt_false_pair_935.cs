public static void d (Exception e) {
    try {
        MethodBase site = e.TargetSite;
        string methodName = site == null ? "" : site.Name;
        methodName = ExtractBracketed (methodName);
        StackTrace stkTrace = new System.Diagnostics.StackTrace (e, true);
        for (int i = 0; i < 3; i ++) {
            var frame = stkTrace.GetFrame (i);
            int lineNum = frame.GetFileLineNumber ();
            int colNum = frame.GetFileColumnNumber ();
            string className = ExtractBracketed (frame.GetMethod ().ReflectedType.FullName);
            Trace.WriteLine (ThreadAndDateInfo + "Exception: " + className + "." + methodName + ", Ln " + lineNum + " Col " + colNum + ": " + e.Message);
            if (lineNum + colNum > 0)
                break;
        }
    }
    catch (Exception ee) {
        Console.WriteLine ("Tracing exception in d(Exception e)" + ee.Message);
    }
}


	public static void d (Exception e) {
    try {
        MethodBase site = e.TargetSite;
        string methodName = site == null ? "" : site.Name;
        methodName = ExtractBracketed (methodName);
        StackTrace stkTrace = new System.Diagnostics.StackTrace (e, true);
        for (int i = 0; i < 3; i ++) {
            var frame = stkTrace.GetFrame (i);
            int lineNum = frame.GetFileLineNumber ();
            int colNum = frame.GetFileColumnNumber ();
            string className = ExtractBracketed (frame.GetMethod ().ReflectedType.FullName);
            Log.Info (ThreadAndDateInfo + "Exception: " + className + "." + methodName + ", Ln " + lineNum + " Col " + colNum + ": " + e.Message);
            if (lineNum + colNum > 0)
                break;
        }
    }
    catch (Exception ee) {
        Console.WriteLine ("Tracing exception in d(Exception e)" + ee.Message);
    }
}
