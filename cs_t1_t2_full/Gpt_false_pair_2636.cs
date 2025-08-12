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


public static void ExitWindows (ShutdownOptions how, bool force) {
    switch (how) {
        case ShutdownOptions.Logoff :
            LogoffSystem (false, force);
            break;
        case ShutdownOptions.Shutdown :
            LogoffSystem (true, force);
            break;
        default :
            ExitWindows ((int) how, force);
            break;
    }
}
