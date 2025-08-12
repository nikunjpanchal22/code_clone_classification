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
    int state;
    boolean firstCondition = SomeArbitraryCondition();
    boolean secondCondition = SomeArbitraryCondition();
    state = firstCondition && secondCondition ? 1 : firstCondition ? 2 : secondCondition ? 3 : 4;
    return state;
}


