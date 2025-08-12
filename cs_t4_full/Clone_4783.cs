static void Main (string [] args) {
    string [] cDirectories = Directory.GetDirectories ("C:\\");
    List < DirectorySize > listSizes = new List < DirectorySize > ();
    for (int i = 0; i < cDirectories.Length; i ++) {
        long size = GetDirectorySize (cDirectories [i]);
        if (size != - 1) {
            listSizes.Add (new DirectorySize () {DirectoryName = cDirectories [i], DirectorySizes = size});
        }
    }
}


 static void Main(string[] args)
{
    string[] cDirectories = Directory.EnumerateDirectories("C:\\").ToArray();

    List<DirectorySize> listSizes = new List<DirectorySize>();
    foreach(string dir in cDirectories)
    {
        long size = GetDirectorySize(dir);

        if (size != -1)
        {
            listSizes.Add(new DirectorySize
            {
                DirectoryName = dir,
                DirectorySizes = size
            });
        }
    }
}


