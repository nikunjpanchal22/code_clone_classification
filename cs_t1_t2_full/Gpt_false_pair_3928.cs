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


public MyType doSomething (bool c, bool d) {
    switch (c) {
        case true :
            if (d)
                return doCD ();
            return doC ();
        default :
            if (d)
                return doD ();
            return doNotCNotD ();
    }
}
