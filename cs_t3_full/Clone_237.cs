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


  static void Main (string [] args) {
                if (!Environment.UserInteractive)
            { 
                ServiceBase[] servicesRun = new ServiceBase[] { new Service() };
                ServiceBase.Run(servicesRun);
                return;
            }

            //run lib
            MainLib instanceLib = new MainLib();
            instanceLib.Start();
}


