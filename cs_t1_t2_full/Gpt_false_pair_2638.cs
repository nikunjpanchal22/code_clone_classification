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


public static void ExitWindows (RestartOptions how, bool force) {
    switch (how) {
        case RestartOptions.Suspend :
            SleepSystem (false, force);
            break;
        case RestartOptions.Hibernate :
            SleepSystem (true, force);
            break;
        default :
            QuitWindows ((int) how, force);
            break;
    }
}
