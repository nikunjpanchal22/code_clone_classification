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
    boolean firstCondition = SomeArbitraryCondition();
    boolean secondCondition = SomeArbitraryCondition();

    if (firstCondition && secondCondition) return 1;
    if (firstCondition) return 2;
    if (secondCondition) return 3;
    return 4;
}


