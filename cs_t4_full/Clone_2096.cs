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
    if(a == true && b == true) return doAB();
    if(a == true && b == false) return doA();
    if(a == false && b == true) return doB();
    if(a == false && b == false) return doNotANotB();
    return null;
}


