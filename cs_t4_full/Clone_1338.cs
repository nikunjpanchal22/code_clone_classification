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
    Dictionary<string, long> dirSizes = new Dictionary<string, long>();
    foreach (string item in cDirectories)
    {
        long size = GetDirectorySize(item);
        if (size != -1)
        {
            dirSizes.Add(item, size);
        }
    }
}


