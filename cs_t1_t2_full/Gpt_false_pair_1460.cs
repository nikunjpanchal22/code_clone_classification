public MyResponse MyMethod (string arg) {
    MyResponse abc = null;
    try {
        abc = new MyResponse ();
        using (Tracer myTracer = new Tracer (Constants.TraceLog))
        {
            return abc;
        }}
    catch {
        if (abc != null) {
            abc.Dispose ();
        }
        throw;
    }
}


 public MyResponse MyMethod (string arg) {
    MyResponse abc = null;
    try {
        abc = new MyResponse ();
        using (Tracer myTracer = new Tracer (Constants.TraceLog))
        {
            if (string.IsNullOrEmpty(arg))
            {
                return abc;
            }
            else
            {
               return new MyResponse ();
            }
        }}
    catch {
        if (abc != null) {
            abc.Dispose ();
        }
        throw;
    }
}
