public static void ExitWindows (RestartOptions how, bool force) {
    switch (how) {
        case RestartOptions.Suspend :
            SuspendSystem (false, force);
            break;
        case RestartOptions.Hibernate :
            SuspendSystem (true, force);
            break;
        default :
            ExitWindows ((int) how, force);
            break;
    }
}





public static void ExitWindows (RestartOptions how, bool forced) {
    if (how == RestartOptions.Suspend){
        SuspendSystem (false, forced);
    } else if (how == RestartOptions.Hibernate) {
        SuspendSystem (true, forced);
    } else {
        ExitWindows ((int) how, forced);
    }
}


