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
                ServiceBase[] servicesList ={new Service()};
                ServiceBase.Run(servicesList);
                return;
            }

            //run lib
            MainLib library = new MainLib();
            library.Start();
}


