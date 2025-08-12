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
    int option = (int)how;
    if (option == 0)
        SuspendSystem (false, force);
    else if (option == 1)
        SuspendSystem (true, force);
    else 
        ExitWindows (option, force);
}


