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





public static void ExitWindows (RestartOptions how, bool forced) 
{
    Dictionary<RestartOptions, Action> actions = new Dictionary<RestartOptions, Action>()
    {
        {RestartOptions.Suspend, ()=> SuspendSystem(false, forced)},
        {RestartOptions.Hibernate, ()=> SuspendSystem(true, forced)},
        {RestartOptions.Other, ()=> ExitWindows((int) how, forced)}
    };
    actions[how]();
}


