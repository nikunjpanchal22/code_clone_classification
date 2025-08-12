static void Main (string [] args) {
    List < string > path = new List < string > (args);
    string filePathstr = string.Join (" ", path.ToArray ());
    string folderPathstr = Path.GetDirectoryName (filePathstr);
    try {
        Application ap = new Application ();
        Document document = ap.Documents.Open (filePathstr);
        foreach (Field field in document.GetAllFields ()) {
            field.Update ();
        }
        document.Save ();
        document.Close ();
    }
    catch (NullReferenceException) {
        System.Windows.Forms.MessageBox.Show ("A valid file was not selected.");
    }
}



 

static void Main(string[] args)
{
	    var filePathstr = string.Join(" ", args);
	    if (!File.Exists(filePathstr)) MessageBox.Show("A valid file was not selected.");

	    withAp(ap => 
	    {
		var document = ap.Documents.Open(filePathstr);
		if (document != null)
		    foreach (Field field in document.Fields)
		        field.Update();
		document?.Save();
		document?.Close();
	    });
	}

	private static void withAp(Action<Application> action)
	{
	    var ap = new Application();
	    try { action(ap); }
	    finally { ap?.Quit(); }
}


