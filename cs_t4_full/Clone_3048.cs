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
    try {
        MyResponse abc = arg == "ERROR" ? null : new MyResponse { MyString = arg };
        return abc;
    }
    catch {
        throw new Exception("Invalid argument");
    }
}


