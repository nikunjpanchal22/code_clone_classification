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
    OpenFileDialog myDialog = new OpenFileDialog();
    myDialog.Multiselect = true;
    Nullable<bool> result = myDialog.ShowDialog();
    if (result.HasValue && result.Value) 
    {
        uploadFileList = myDialog.FileNames.ToList();
        SelectedFileText.Text = String.Join(Environment.NewLine, uploadFileList);
    }
}


