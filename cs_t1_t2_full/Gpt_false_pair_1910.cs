static void Main (string [] args) {
    Console.ForegroundColor = ConsoleColor.Green;
    StringBuilder sbOutFile = new StringBuilder ();
    Console.WriteLine ("DisplayName;IdentifyingNumber");
    sbOutFile.AppendLine ("Machine;DisplayName;Version");
    string [] lines = File.ReadAllLines (@"File_In/collectionMachines.txt");
    foreach (var machine in lines) {
        var registry_key = @"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall";
        using (Microsoft.Win32.RegistryKey key = RegistryKey.OpenRemoteBaseKey (RegistryHive.LocalMachine, machine).OpenSubKey (registry_key))
        {
            foreach (string subkey_name in key.GetSubKeyNames ()) {
                using (RegistryKey subkey = key.OpenSubKey (subkey_name))
                {
                    if (subkey.GetValue ("DisplayName") != null) {
                        Console.WriteLine (string.Format ("{0};{1};{2}", machine, subkey.GetValue ("DisplayName"), subkey.GetValue ("Version")));
                        sbOutFile.AppendLine (string.Format ("{0};{1};{2}", machine, subkey.GetValue ("DisplayName"), subkey.GetValue ("Version")));
                    }
                }}
        }}
    var fileOutName = string.Format (@"File_Out\{0}_{1}.csv", "Software_Inventory", DateTime.Now.ToString ("yyyy_MM_dd_HH_mmssfff"));
    using (var file = new System.IO.StreamWriter (fileOutName))
    {
        file.WriteLine (sbOutFile.ToString ());
    } Console.WriteLine ("Press enter to continue !");
    Console.ReadLine ();
}


 static void Main (string [] args) {
    Console.ForegroundColor = ConsoleColor.Magenta;
    StringBuilder sbOutFile = new StringBuilder ();
    Console.WriteLine ("Program;Identify Number");
    sbOutFile.AppendLine ("Computer;Program;Edition");
    string [] lines = File.ReadAllLines (@"File_In/collectionMachines.txt");
    foreach (var machine in lines) {
        var registry_key = @"SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall";
        using (Microsoft.Win32.RegistryKey key = RegistryKey.OpenRemoteBaseKey (RegistryHive.LocalMachine, machine).OpenSubKey (registry_key))
        {
            foreach (string subkey_name in key.GetSubKeyNames ()) {
                using (RegistryKey subkey = key.OpenSubKey (subkey_name))
                {
                    if (subkey.GetValue ("Program") != null) {
                        Console.WriteLine (string.Format ("{0};{1};{2}", machine, subkey.GetValue ("Program"), subkey.GetValue ("Edition")));
                        sbOutFile.AppendLine (string.Format ("{0};{1};{2}", machine, subkey.GetValue ("Program"), subkey.GetValue ("Edition")));
                    }
                }}
        }}
    var fileOutName = string.Format (@"File_Out\{0}_{1}.csv", "Software_Inventory", DateTime.Now.ToString ("yyyy_MM_dd_HH_mmssfff"));
    using (var file = new System.IO.StreamWriter (fileOutName))
    {
        file.WriteLine (sbOutFile.ToString ());
    } Console.WriteLine ("Press enter to continue !");
    Console.ReadLine ();
}
