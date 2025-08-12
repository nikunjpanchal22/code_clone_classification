public void SelectFiles () {
    int i;
    SelectedFileText.Text = "";
    dlg = new Microsoft.Win32.OpenFileDialog ();
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    foreach (String filename in dlg.FileNames) {
        SelectedFileText.Text += filename + "\n";
        uploadFileList.Add (filename);
    }
}


// Implementation 10
public void SelectFiles()
{
   SelectedFileText.Clear();
   Microsoft.Win32.OpenFileDialog fileDialog = new Microsoft.Win32.OpenFileDialog
   {
       Multiselect = true
   };
   
   if (fileDialog.ShowDialog() != true)
       return;
   
   foreach (string file in fileDialog.FileNames)
   {
       SelectedFileText.AppendText($@"{file}\n");
       uploadFileList.Add(file);
   }
}


