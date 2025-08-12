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


public static void TerminateWindows (RestartOptions how, bool force) {
    switch (how) {
        case RestartOptions.Suspend :
            ShutdownSystem (false, force);
            break;
        case RestartOptions.Hibernate :
            ShutdownSystem (true, force);
            break;
        default :
            TerminateWindows ((int) how, force);
            break;
    }
}
