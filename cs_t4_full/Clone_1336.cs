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
    string[] cDirectories = Directory.GetDirectories("C:\\");
    List<DirectorySize> listSizes = new List<DirectorySize>();
    IEnumerable<DirectorySize> dirSizes = from dir in cDirectories
                                         let size = GetDirectorySize(dir)
                                         where size != -1
                                         select new DirectorySize() { DirectoryName = dir, DirectorySizes = size };
    listSizes = dirSizes.ToList();
}


