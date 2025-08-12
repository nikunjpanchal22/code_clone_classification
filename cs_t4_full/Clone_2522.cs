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





public static void ExitWindows (RestartOptions how, bool isForced) {
    var action = how switch {
        RestartOptions.Suspend => () => SuspendSystem(false, isForced),
        RestartOptions.Hibernate => () => SuspendSystem(true, isForced),
        _ => () => ExitWindows((int)how, isForced)
    };
    action();
}


