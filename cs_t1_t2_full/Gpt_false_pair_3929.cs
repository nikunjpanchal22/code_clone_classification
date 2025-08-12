public MyType doSomething (bool a, bool b) {
    switch (a) {
        case true :
            if (b)
                return doAB ();
            return doA ();
        default :
            if (b)
                return doB ();
            return doNotANotB ();
    }
}


public MyType doSomethingElse (bool e, bool f) {
    switch (e) {
        case true :
            if (f)
                return doEF ();
            return doE ();
        default :
            if (f)
                return doF ();
            return doNotENotF ();
    }
}
