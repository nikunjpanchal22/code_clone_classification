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
            if (!Environment.UserInteractive) {
                    using (Service serviceInstance = new Service())
                    {
                        ServiceBase.Run(serviceInstance);
                    }
                    return;
                }

                //run lib
                MainLib lib = new MainLib();
                lib.Start();
}


