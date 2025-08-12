public int PerformAction () {
    int state;
    if (SomeArbitraryCondition ()) {
        if (SomeArbitraryCondition ()) {
            state = 1;
        } else {
            state = 2;
        }
    } else {
        if (SomeArbitraryCondition ()) {
            state = 3;
        } else {
            state = 4;
        }
    }
    return state;
}



public int PerformAction() {
    int state = 4;
    if (SomeArbitraryCondition()) {
        if (SomeArbitraryCondition()) state = 1;
        else state = 2;
    } else {
        if (SomeArbitraryCondition()) state = 3;
    }
    return state;
}


