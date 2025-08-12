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


 public static void ExitWindows (RestartOptions how, bool force)
{
    SuspendSystem (how == RestartOptions.Hibernate, force);
    if (how != RestartOptions.Hibernate && how != RestartOptions.Suspend)
        ExitWindows ((int) how, force);
}


