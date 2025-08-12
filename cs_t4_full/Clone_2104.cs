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





public MyType doSomething (bool a, bool b) {
   return a && b ? doAB() : (!a && !b ? doNotANotB() : (a ? doA() : doB()));
}


