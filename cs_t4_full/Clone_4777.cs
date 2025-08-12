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
    using (IEnumerator<string> cDirectoriesEnumerator = cDirectories.GetEnumerator())
    {
        while (cDirectoriesEnumerator.MoveNext())
        {
            long size = GetDirectorySize(cDirectoriesEnumerator.Current);

            if (size != -1)
            {
                listSizes.Add(new DirectorySize
                {
                    DirectoryName = cDirectoriesEnumerator.Current,
                    DirectorySizes = size
                });
            }
        }
    }
}


