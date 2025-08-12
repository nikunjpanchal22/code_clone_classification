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
    Boolean[] results = {
        SomeArbitraryCondition(),
        SomeArbitraryCondition(),
        SomeArbitraryCondition()
    };

    if (results[0]) return results[1] ? 1 : 2;
    else return results[2] ? 3 : 4;
}


