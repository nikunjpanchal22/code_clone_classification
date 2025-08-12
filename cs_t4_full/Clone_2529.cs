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





public static void ExitWindows (RestartOptions how, bool doForce) 
{
	    ExecuteActionBasedOnRestartOption(doForce, how == RestartOptions.Suspend, 
	    how == RestartOptions.Hibernate, (int)how);
	} 

	private static void ExecuteActionBasedOnRestartOption(bool doForce, bool isSuspend, bool isHibernate, int shutDown) 
	{
	    if (isSuspend)
	    {
		SuspendSystem(false, doForce);
	    }
	    else if (isHibernate)
	    {
		SuspendSystem(true, doForce);
	    }
	    else 
	    {
		ExitWindows(shutDown, doForce);
	    }
}


