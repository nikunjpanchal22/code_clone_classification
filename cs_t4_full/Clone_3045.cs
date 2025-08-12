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
        MyResponse abc = new MyResponse();
        abc.MyString = arg.Equals("ERROR") ? null : arg;
        return abc;
    }
    catch {
        return null;
    }
}


