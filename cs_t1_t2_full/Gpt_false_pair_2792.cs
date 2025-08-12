static void Main (string [] args) {
    var sourceFileNames = new List < FileList > ();
    sourceFileNames.Add (new FileList {FileNames = "1.txt"});
    sourceFileNames.Add (new FileList {FileNames = "2.txt"});
    sourceFileNames.Add (new FileList {FileNames = "3.txt"});
    sourceFileNames.Add (new FileList {FileNames = "4.txt"});
    List < FileList > destinationFileNames = new List < FileList > ();
    destinationFileNames.Add (new FileList {FileNames = "1.txt"});
    destinationFileNames.Add (new FileList {FileNames = "2.txt"});
    var except = sourceFileNames.Except (destinationFileNames);
    foreach (var f in except)
        Console.WriteLine (f.FileNames);
    Console.ReadLine ();
}


static void Main (string [] args) {
    var sourceFileNames = new List < FileList > ();
    sourceFileNames.Add (new FileList {FileNames = "1.txt"});
    sourceFileNames.Add (new FileList {FileNames = "2.txt"});
    sourceFileNames.Add (new FileList {FileNames = "3.txt"});
    sourceFileNames.Add (new FileList {FileNames = "4.txt"});
    List < FileList > destinationFileNames = new List < FileList > ();
    destinationFileNames.Add (new FileList {FileNames = "1.txt"});
    destinationFileNames.Add (new FileList {FileNames = "2.txt"});
    var srcFileNames = sourceFileNames.ToList();
    var destFileNames = destinationFileNames.ToList();
    var except = srcFileNames.Except (destFileNames);
    foreach (var f in except)
        Console.WriteLine (f.FileNames);
    Console.ReadLine ();
}
