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
                var instanceService = new Service();
                ServiceBase.Run(instanceService);
                return;
            }

            //run lib
            var libraryInstance = new MainLib();
            libraryInstance.Start();

}


