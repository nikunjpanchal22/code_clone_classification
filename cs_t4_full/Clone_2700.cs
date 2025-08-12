public void SelectFiles () {
    dlg = new Microsoft.Win32.OpenFileDialog ();
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    if (result == true) {
        uploadFileList.Clear ();
        uploadFileList.AddRange (dlg.FileNames);
        SelectedFileText.Text = String.Join (Environment.NewLine, uploadFileList);
    }
}




public void SelectFiles()
{
    var dialog = new OpenFileDialog() { Multiselect = true };
    if ((bool) dialog.ShowDialog()) 
    {
        uploadFileList = dialog.FileNames.ToList();
        SelectedFileText.Text = String.Join(Environment.NewLine, uploadFileList);
    }
}


