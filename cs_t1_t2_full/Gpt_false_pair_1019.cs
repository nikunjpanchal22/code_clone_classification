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


  static void Main (string [] args) { 
            // Try catch to catch any exceptions thrown. 
            try 
            { 
                // Create list and string variables. 
                List<string> path = new List<string>(args); 
                string filePathstr = string.Join(" ", path.ToArray()); 
                string folderPathstr = Path.GetDirectoryName(filePathstr); 

                // Create an Application and Document objects. 
                Application ap = new Application(); 
                Document document = ap.Documents.Open(filePathstr); 

                // Get all fields from the Document object. 
                foreach (Field field in document.GetAllFields()) 
                { 
                    // Update each field. 
                    field.Update(); 
                } 

                // Save the updated Document back to file. 
                document.Save(); 
                document.Close(); 
            } 
            catch (NullReferenceException) 
            { 
                System.Windows.Forms.MessageBox.Show("A valid file was not selected."); 
            } 
}
