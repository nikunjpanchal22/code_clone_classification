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
    if(a && b) return doAB();
    else if(a && !b) return doA();
    else if(!a && b) return doB();
    else return doNotANotB();
}


