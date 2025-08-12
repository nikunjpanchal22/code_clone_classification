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
    MyType result = doNotANotB();
    if(a && b) result = doAB();
    else if(a) result = doA();
    else if(b) result = doB();
    return result;
}


