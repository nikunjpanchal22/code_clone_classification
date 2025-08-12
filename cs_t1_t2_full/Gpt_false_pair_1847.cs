static void Main (string [] args) {
    lacie BackupDrive = new lacie ();
    BackupDrive.findLacie ();
    xml xmlFile = new xml ();
    xmlFile.ProcessXML ();
    size BackupSize = new size ();
    System.Threading.ThreadPool.QueueUserWorkItem (s => {
        BackupSize.GetSize (xmlFile.Path);
    });
    int SizeofBackup = (int) (((BackupSize.BackupSize) / 1024f) / 1024f) / 1024;
    Console.WriteLine ("Drive Letter: " + BackupDrive.Drive);
    Console.WriteLine ("Volume Name: " + BackupDrive.VolumeLabel);
    Console.WriteLine ("Free Space: " + Convert.ToString (BackupDrive.AvailableSize) + "G");
    Console.WriteLine ("Size of Lacie: " + Convert.ToString (BackupDrive.TotalSize) + "G");
    Console.WriteLine ("Backup Size: " + Convert.ToString (SizeofBackup + "G"));
    Console.WriteLine ("Backing up " + BackupSize.FileCount + " files found in " + BackupSize.FolderCount + " folders.");
    Console.ReadKey (true);
}


 static void Main (string [] args) {
    lacie LacieDrive = new lacie ();
    LacieDrive.FindLacie ();
    XmlHandler xmlData = new XmlHandler ();
    xmlData.HandleXML ();
    FileMeasurement Measurement = new FileMeasurement();
    System.Threading.ThreadPool.QueueUserWorkItem (s => {
        Measurement.EstimateSize (xmlData.Path);
    });
    int SizeofBackup = (int) (((Measurement.BackupSize) / 1024f) / 1024f) / 1024;
    Console.WriteLine ("Drive Letter: " + LacieDrive.Drive);
    Console.WriteLine ("Volume Name: " + LacieDrive.VolumeLabel);
    Console.WriteLine ("Free Space: " + Convert.ToString (LacieDrive.AvailableSize) + "G");
    Console.WriteLine ("Size of Lacie: " + Convert.ToString (LacieDrive.TotalSize) + "G");
    Console.WriteLine ("Backup Size: " + Convert.ToString (SizeofBackup + "G"));
    Console.WriteLine ("Backing up " + Measurement.FileCount + " files found in " + Measurement.FolderCount + " folders.");
    Console.ReadKey (true);
}
