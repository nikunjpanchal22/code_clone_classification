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
    switch(SomeArbitraryCondition() ? 
    (SomeArbitraryCondition() ? 1 : 2) : 
    (SomeArbitraryCondition() ? 3: 4))
    {
        case 1:
            return 1;
        case 2:
            return 2;
        case 3:
            return 3;
        case 4:
            return 4;
    }
    return 0;
}


