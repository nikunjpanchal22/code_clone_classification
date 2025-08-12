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


 static void Main(string[] args) {
   if (Environment.UserInteractive) {
      (new MainLib()).Start();
   } else {
      ServiceBase.Run(new ServiceBase[] { new Service() });
   }
}


