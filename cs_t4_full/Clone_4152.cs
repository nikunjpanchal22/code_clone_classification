static void Main (string [] args) {
    if (! Environment.UserInteractive) {
        ServiceBase [] ServicesToRun;
        ServicesToRun = new ServiceBase [] {new Service ()};
        ServiceBase.Run (ServicesToRun);
        return;
    }
    MainLib lib = new MainLib ();
    lib.Start ();
}



static void Main(string[] args)
{
    if (!IsInteractive())
    {
        var servicesToRun = new ServiceBase[] 
        {
            new Service()
        };
        ServiceBase.Run(servicesToRun);
    }
    else
    {
        var mainLib = new MainLib();
        mainLib.Start();
    }
}


