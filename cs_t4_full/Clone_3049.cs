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
        return new MyResponse { MyString = arg };
    }
    catch (Exception ex) {
        Console.WriteLine(ex.Message);
        return null;
    }
}


