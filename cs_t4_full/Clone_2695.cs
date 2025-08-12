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
    OpenFileDialog dialog = new OpenFileDialog();
    dialog.Multiselect = true;
    if (dialog.ShowDialog().GetValueOrDefault(false))
    {
        uploadFileList.Clear();
        uploadFileList.AddRange(dialog.FileNames);
        SelectedFileText.Text = string.Join("\n", uploadFileList);
    }
}


