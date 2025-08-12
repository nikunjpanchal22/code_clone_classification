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
    if (how == RestartOptions.Suspend || how == RestartOptions.Hibernate)
        SuspendSystem ((how == RestartOptions.Hibernate), force);
    else
        ExitWindows((int)how, force);
}


