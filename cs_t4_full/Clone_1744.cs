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


 int PerformAction () {
    int state;
    if (SomeArbitraryCondition ()) {
        state = (SomeArbitraryCondition ()) ? 2 : 1;
    } else {
        state = (SomeArbitraryCondition ()) ? 4 : 3;
    }
    return state;
}


