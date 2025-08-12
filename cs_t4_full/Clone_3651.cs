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
    state -= SomeArbitraryCondition() ? (SomeArbitraryCondition() ? 3 : 2) : (SomeArbitraryCondition() ? 1 : 0);         
    return state;
}


